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
package za.co.mmagon.jwebswing.components.globalize.cultures;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
 * @author GedMarc
 */
@PluginInformation(pluginName = "Globalize",
                   pluginUniqueName = "globalize",
                   pluginDescription = "A JavaScript library for internationalization and localization that leverages the official Unicode CLDR JSON data ",
                   pluginVersion = "1.2.2",
                   pluginDependancyUniqueIDs = "jquery",
                   pluginCategories = "internalization, globalization, globalize",
                   pluginSubtitle = "A JavaScript library for internationalization and localization that leverage the official Unicode CLDR JSON data. The library works both for the browser and as a Node.js module.",
                   pluginGitUrl = "https://github.com/globalizejs/globalize",
                   pluginSourceUrl = "https://github.com/GedMarc/JWebSwing-GlobalizePlugin",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-GlobalizePlugin/wiki",
                   pluginOriginalHomepage = "https://github.com/globalizejs/globalize",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/GlobalizePlugin.jar/download",
                   pluginIconUrl = "bower_components/globalize/icon.png",
                   pluginIconImageUrl = "bower_components/globalize/example.png",
                   pluginLastUpdatedDate = "2017/03/04"
)
public class GlobalizePageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    @Override
    public Page configure(Page page)
    {
        return page;
    }

}
