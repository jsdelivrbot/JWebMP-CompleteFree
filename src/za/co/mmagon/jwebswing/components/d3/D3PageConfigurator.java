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
package za.co.mmagon.jwebswing.components.d3;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
 * @author GedMarc
 */
@PluginInformation(pluginName = "D3 Graphing",
                   pluginUniqueName = "d3",
                   pluginDescription = "D3.js is a JavaScript library for manipulating documents based on data. D3 helps you bring data to life using HTML, SVG, and CSS. D3’s emphasis on web standards gives you the full capabilities of modern browsers without tying yourself to a proprietary framework, combining powerful visualization components and a data-driven approach to DOM manipulation. ",
                   pluginVersion = "1.4.1",
                   pluginDependancyUniqueIDs = "jquery",
                   pluginCategories = "d3, graphing, reports, graphs",
                   pluginSubtitle = "Create stunning graphs using the D3 toolkit.",
                   pluginGitUrl = "https://github.com/GedMarc/JWebSwing-D3Plugin",
                   pluginSourceUrl = "https://github.com/d3/d3",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-D3Plugin/wiki",
                   pluginOriginalHomepage = "https://d3js.org/",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/D3Plugin.jar/download",
                   pluginIconUrl = "bower_components/d3/icon.jpg",
                   pluginIconImageUrl = "bower_components/d3/example.png",
                   pluginLastUpdatedDate = "2017/03/04"
)
public class D3PageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    @Override
    public Page configure(Page page)
    {
        return page;
    }

}
