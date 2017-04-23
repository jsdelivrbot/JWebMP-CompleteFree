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
package za.co.mmagon.jwebswing.components.jqueryui.themes;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
 * @author GedMarc
 * @since 28 Feb 2017
 *
 */
@PluginInformation(pluginName = "JQuery UI Themes (Nestable)", pluginUniqueName = "jquery-ui-themes-nestable",
                   pluginDescription = "ThemeRoller allows you to design custom jQuery UI themes for tight integration in your projects. To create a custom theme, select the Roll your own tab and tweak the settings. As you work, the UI components to the right will update to reflect your design and you can download your theme whenever you like.",
                   pluginVersion = "1.12.1",
                   pluginDependancyUniqueIDs = "jquery-ui",
                   pluginCategories = "jquery, ui, jquery-ui",
                   pluginSubtitle = "JQuery UI Themes that can be nested",
                   pluginGitUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIThemesNestablePlugin",
                   pluginSourceUrl = "http://jqueryui.com/",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIThemesNestablePlugin/wiki",
                   pluginOriginalHomepage = "http://jqueryui.com/themeroller/",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQueryUIThemesNestablePlugin.jar/download",
                   pluginIconUrl = "css/theming/themeroller_icon.jpg",
                   pluginIconImageUrl = "css/theming/themeroller_example.jpg",
                   pluginLastUpdatedDate = "2017/03/04"
)
public class JQUINestableThemesPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    public JQUINestableThemesPageConfigurator()
    {

    }

    @Override
    public Page configure(Page page)
    {
        return page;
    }
}
