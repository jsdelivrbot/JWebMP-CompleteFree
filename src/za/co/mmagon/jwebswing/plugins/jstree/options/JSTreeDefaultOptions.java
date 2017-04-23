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
package za.co.mmagon.jwebswing.plugins.jstree.options;

import java.util.ArrayList;
import java.util.List;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 *
 * @author GedMarc
 * @since 22 Dec 2016
 * @version 1.0
 *
 */
@ComponentInformation(name = "JS Tree Sort Plugin",
                      description = "This plugin automatically arranges all sibling nodes according to a comparison config option function, which defaults to alphabetical order.",
                      url = "https://www.jstree.com/plugins/")
public class JSTreeDefaultOptions extends JavaScriptPart
{

    private static final long serialVersionUID = 1L;

    /**
     * configure which plugins will be active on an instance. Should be an array of strings, where each element is a plugin name. The default is
     */
    private List<String> plugins;

    public JSTreeDefaultOptions()
    {

    }

    /**
     * configure which plugins will be active on an instance. Should be an array of strings, where each element is a plugin name. The default is
     *
     * @return
     */
    public List<String> getPlugins()
    {
        if (plugins == null)
        {
            plugins = new ArrayList<>();
        }
        return plugins;
    }

    /**
     * configure which plugins will be active on an instance. Should be an array of strings, where each element is a plugin name. The default is
     *
     * @param plugins
     */
    public void setPlugins(List<String> plugins)
    {
        this.plugins = plugins;
    }

    /**
     * Adds the sort plugin to these options
     *
     * @return
     */
    public JSTreeDefaultOptions addSortPlugin()
    {
        plugins.add("Sort");
        return this;
    }

    /**
     * Adds the whole row plugin to the tree
     *
     * @return
     */
    public JSTreeDefaultOptions addWholeRowPlugin()
    {
        plugins.add("Sort");
        return this;
    }
}
