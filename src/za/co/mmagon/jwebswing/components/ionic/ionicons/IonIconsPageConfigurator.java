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
package za.co.mmagon.jwebswing.components.ionic.ionicons;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
 * @author GedMarc
 * @since 26 Feb 2017
 *
 */
@PluginInformation(pluginName = "IonIcons", pluginUniqueName = "ion-icons",
                   pluginDescription = "The premium icon font for Ionic Framework.",
                   pluginVersion = "2.0.1",
                   pluginDependancyUniqueIDs = "", pluginCategories = "fonts, icons",
                   pluginSubtitle = "The premium icon font for Ionic Framework.",
                   pluginGitUrl = "https://github.com/GedMarc/JWebSwing-IoniconsPlugin",
                   pluginSourceUrl = "https://github.com/driftyco/ionicons",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-IoniconsPlugin/wiki",
                   pluginOriginalHomepage = "http://ionicons.com/",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/IoniconsPlugin.jar/download",
                   pluginIconUrl = "bower_components/Ionicons/ionicons-icon.png",
                   pluginIconImageUrl = "bower_components/Ionicons/ionicons-logo.png",
                   pluginLastUpdatedDate = "2017/03/04"
)
public class IonIconsPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;
    private static final IonIconsCSSReference reference = new IonIconsCSSReference();

    /**
     * A new instance of the page configurator
     */
    public IonIconsPageConfigurator()
    {

    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            page.getBody().addCssReference(reference);
        }
        return page;
    }

    /**
     * Get the reference
     *
     * @return
     */
    public static IonIconsCSSReference getReference()
    {
        return reference;
    }

}
