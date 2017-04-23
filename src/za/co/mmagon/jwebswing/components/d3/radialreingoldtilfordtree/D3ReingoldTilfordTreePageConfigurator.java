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
package za.co.mmagon.jwebswing.components.d3.radialreingoldtilfordtree;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
 * @author GedMarc
 */
@PluginInformation(pluginName = "D3 Reingold Tilford Tree",
                   pluginUniqueName = "d3-reingold-tilford-tree",
                   pluginDescription = "D3.js is a JavaScript library for manipulating documents based on data. D3 helps you bring data to life using HTML, SVG, and CSS. D3’s emphasis on web standards gives you the full capabilities of modern browsers without tying yourself to a proprietary framework, combining powerful visualization components and a data-driven approach to DOM manipulation. ",
                   pluginVersion = "1.4.1",
                   pluginDependancyUniqueIDs = "jquery,d3",
                   pluginCategories = "d3, graphing, reports, graphs",
                   pluginSubtitle = "Create stunning graphs using the D3 toolkit.",
                   pluginGitUrl = "http://txt2vz.appspot.com/",
                   pluginSourceUrl = "https://github.com/GedMarc/JWebSwing-D3ReingoldTelfordTree",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-D3ReingoldTelfordTree/wiki",
                   pluginOriginalHomepage = "http://txt2vz.appspot.com/",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/D3ReingoldTelfordTree.jar/download",
                   pluginIconUrl = "bower_components/jqd3/radial-reingold-tilford-tree/logo.png",
                   pluginIconImageUrl = "bower_components/jqd3/radial-reingold-tilford-tree/logo.png",
                   pluginLastUpdatedDate = "2017/03/04"
)
public class D3ReingoldTilfordTreePageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    @Override
    public Page configure(Page page)
    {
        return page;
    }

}
