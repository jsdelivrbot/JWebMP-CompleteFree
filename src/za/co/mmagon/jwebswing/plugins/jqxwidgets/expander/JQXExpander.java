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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.expander;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * An implementation of the jsTree project.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQX Expander",
        description = "jqxExpander represents a jQuery widget that has header and content sections(like tabs). Click headers to expand or collapse the content. Optionally you can change the default toggle mode to double-click or mouseover. ",
        url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxexpander/jquery-expander-getting-started.htm?search=",
        wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")
public class JQXExpander extends Div<JQXExpanderChildren, JQXExpanderAttributes, JQXExpanderFeature, JQXExpanderEvents, JQXExpander>
{

    private static final long serialVersionUID = 1L;
    private JQXExpanderFeature feature;

    public JQXExpander()
    {
        addFeature(getFeature());
    }

    public JQXExpanderFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXExpanderFeature(this);
        }
        return feature;
    }

    @Override
    public JQXExpanderOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
