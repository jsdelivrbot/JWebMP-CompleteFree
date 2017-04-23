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
package za.co.mmagon.jwebswing.plugins.spectrum.colourpicker;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
 * @author GedMarc
 */
@PluginInformation(pluginName = "Spectrum Colour Picker",
                   pluginUniqueName = "spectrum",
                   pluginDescription = "I wanted a colorpicker that didn't require images, and that had an API that made sense to me as a developer who has worked with color in a number of applications. I had tried a number of existing plugins, but decided to try and make a smaller, simpler one.",
                   pluginVersion = "1.8.0",
                   pluginDependancyUniqueIDs = "jquery,jquery-ui",
                   pluginCategories = "ui, web, colour picker, spectrum, drop down",
                   pluginSubtitle = "A straight forward and simple colour picker with a wide range of options and tools ",
                   pluginGitUrl = "http://github.com/bgrins/spectrum",
                   pluginSourceUrl = "https://github.com/GedMarc/JWebSwing-SpectrumPlugin",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-SpectrumPlugin/wiki",
                   pluginOriginalHomepage = "https://bgrins.github.io/spectrum/",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/SpectrumPlugin.jar/download",
                   pluginIconUrl = "bower_components/spectrum/icon.png",
                   pluginIconImageUrl = "bower_components/spectrum/example.png",
                   pluginLastUpdatedDate = "2017/03/04"
)
public class JQSpectrumPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    @Override
    public Page configure(Page page)
    {
        return page;
    }

}
