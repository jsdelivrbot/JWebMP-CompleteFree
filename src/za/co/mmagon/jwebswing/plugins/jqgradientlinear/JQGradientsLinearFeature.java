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
package za.co.mmagon.jwebswing.plugins.jqgradientlinear;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.children.ImageMapFeatures;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 *
 * @since Forver
 * @author mmagon
 * @version 1.0
 */
public class JQGradientsLinearFeature extends Feature<JavaScriptPart, JQGradientsLinearFeature> implements ImageMapFeatures
{

    private static final long serialVersionUID = 1L;

    private JQGradientOptions options;

    public JQGradientsLinearFeature(Component componentToApply)
    {
        super("JWGradientsFeature");
        setComponent(componentToApply);
        componentToApply.addFeature(this);
        getJavascriptReferences().add(new JQGradientsJavascriptReference());
    }

    @Override
    public void assignFunctionsToComponent()
    {
        addQuery(getComponent().getJQueryID() + "gradient(" + getOptions() + ");" + getNewLine());
    }

    @Override
    public JQGradientOptions getOptions()
    {
        if (options == null)
        {
            options = new JQGradientOptions();
        }
        return options;
    }

}
