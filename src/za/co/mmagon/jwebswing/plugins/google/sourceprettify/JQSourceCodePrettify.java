/* 
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.google.sourceprettify;

import java.io.*;
import java.util.logging.*;
import za.co.mmagon.jwebswing.base.html.*;
import za.co.mmagon.jwebswing.base.html.interfaces.*;
import za.co.mmagon.jwebswing.base.references.*;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.logger.LogFactory;

/**
 *
 * Implements the Google Code Prettify JavaScript
 *
 * @param <J>
 * @since 2014 09 28
 * @version 1.0
 * @author MMagon
 *
 *
 */
@ComponentInformation(name = "google-code-prettify ", description = "An embeddable script that makes source-code snippets in HTML prettier.",
         url = "https://code.google.com/archive/p/google-code-prettify")
public class JQSourceCodePrettify<J extends JQSourceCodePrettify> extends PreFormattedText<J> implements GlobalChildren
{

    private static final java.util.logging.Logger log = LogFactory.getInstance().getLogger("SourceCodePrettify");
    private static final String rootSource = "/";
    private static final long serialVersionUID = 1L;

    private SourceCodeLanguages sourceCodeLanguage = SourceCodeLanguages.Java;
    private SourceCodePrettifyThemes sourceCodePrettifyTheme = SourceCodePrettifyThemes.Default;

    private final JQSourceCodePrettifyFeature feature = new JQSourceCodePrettifyFeature(this);

    /**
     * Constructs a new Source Code Prettify
     */
    public JQSourceCodePrettify()
    {
        addFeature(feature);
    }

    /**
     * Constructs the HTML required for prettify to work
     *
     * @return
     */
    @Override
    protected StringBuilder renderBeforeTag()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(getCurrentTabIndentString()).append("<?prettify lang=").append(getSourceCodeLanguage().name().toLowerCase()).append(" linenums=true?>").append(getNewLine());
        return sb;
    }

    /**
     * Gets the source code language in use
     *
     * @return
     */
    public SourceCodeLanguages getSourceCodeLanguage()
    {
        return sourceCodeLanguage;
    }

    /**
     * Sets the language programming for
     *
     * @param sourceCodeLanguage
     */
    public void setSourceCodeLanguage(SourceCodeLanguages sourceCodeLanguage)
    {
        this.sourceCodeLanguage = sourceCodeLanguage;
    }

    /**
     * Returns the current theme in place. Default is Sons of Obsidion
     *
     * @return
     */
    public SourceCodePrettifyThemes getSourceCodePrettifyTheme()
    {
        return sourceCodePrettifyTheme;
    }

    /**
     * Sets this source code display to a prettify theme
     *
     * @param sourceCodePrettifyTheme
     */
    public void setSourceCodePrettifyTheme(SourceCodePrettifyThemes sourceCodePrettifyTheme)
    {
        this.sourceCodePrettifyTheme = sourceCodePrettifyTheme;
        if (sourceCodePrettifyTheme != null)
        {
            feature.getCssReferences().add(new CSSReference("prettifyTheme", 1.0, sourceCodePrettifyTheme.getCssReference()));
        }
    }

    /**
     * Sets the displaying theme that this feature will use
     *
     * @param theme The theme to use
     */
    public final void setTheme(SourceCodePrettifyThemes theme)
    {
        this.sourceCodePrettifyTheme = theme;
        if (this.sourceCodePrettifyTheme != null)
        {
            getCssReferences().add(new CSSReference(theme.name(), 1.0, theme.getCssReference(), theme.getCssReference()));
        }
    }

    /**
     * Takes a physical file to a string for display
     *
     * @param classToRender
     * @return
     */
    public StringBuilder fileToString(Class classToRender)
    {
        String fileName = rootSource + classToRender.getCanonicalName().replace('.', '\\').replace("/", "\\") + ".java" + "?format=raw";
        File file = new File(fileName);
        if (!file.exists())
        {
            Logger.getLogger("fileToString").log(Level.SEVERE, "Couldn''t find java file [{0}]", fileName);
            // return new StringBuilder("Couldn't find java file [" + fileName + "]");
        }

        StringBuilder sb = new StringBuilder();
        try
        {
            try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr))
            {
                String line = br.readLine();
                while (line != null)
                {
                    if (!line.startsWith("import"))
                    {
                        sb.append(line).append("\n");
                    }
                    line = br.readLine();
                }
                fr.close();
                br.close();
            }

        }
        catch (FileNotFoundException ex)
        {
            log.log(Level.SEVERE, "File Not Found ", ex);
        }
        catch (IOException ex)
        {
            log.log(Level.SEVERE, "IO Error reading file", ex);
        }

        return sb;
    }

}
