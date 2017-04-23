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
package za.co.mmagon.jwebswing.plugins.bootstrap.tooltips;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.popovers.BSPopOverFeatures;
import za.co.mmagon.jwebswing.plugins.bootstrap.popovers.BSPopOverOptions;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @since 2013/01/16
 * @version 1.0
 */
public class BSTooltipFeature extends Feature<BSPopOverOptions, BSTooltipFeature> implements BSPopOverFeatures, GlobalFeatures
{

    private static final long serialVersionUID = 1L;

    private BSPopOverOptions options;

    /**
     * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
     * <p>
     * @param forComponent
     */
    public BSTooltipFeature(Component forComponent)
    {
        super("BootstrapPopoverFeature");
        setComponent(forComponent);
        BootstrapPageConfigurator.setBootstrapRequired(forComponent, true);
    }

    /**
     * Returns all the tooltip options
     * <p>
     * @return
     */
    @Override
    public BSPopOverOptions getOptions()
    {
        if (options == null)
        {
            options = new BSPopOverOptions();
        }
        return options;
    }

    @Override
    public void assignFunctionsToComponent()
    {
        String requiredString = getComponent().getJQueryID()
                + "tooltip(" + getOptions() + ");" + getNewLine();
        addQuery(requiredString);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 79 * hash + (this.getID().hashCode());
        return hash;
    }
}
