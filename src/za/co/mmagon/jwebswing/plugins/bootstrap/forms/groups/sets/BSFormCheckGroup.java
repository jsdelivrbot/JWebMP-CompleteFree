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
package za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.sets;

import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSFormLabel;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls.BSInput;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSComponentFormGroupOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSFormGroup;

/**
 * A bootstrap formatted radio button
 *
 * @author GedMarc
 * @param <J>
 *
 * @since 18 Jan 2017
 *
 */
public class BSFormCheckGroup<J extends BSFormCheckGroup> extends BSFormGroup<BSInput, J> implements BSFormSetChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new instance of a group of items that denote a single radio button.
     * <p>
     * Place inside a BS Form Set
     *
     * @param label
     * @param inputComponent
     * @param helpText
     * @param value
     *
     * @see BSFormSet
     */
    public BSFormCheckGroup(BSFormLabel label, BSFormCheckInput inputComponent, String helpText, String value)
    {
        super(label, inputComponent, helpText);
        inputComponent.addAttribute("value", value);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Adds all the necessary items
     */
    @Override
    public void preConfigure()
    {
        if (!isConfigured())
        {
            addClass(BSComponentFormGroupOptions.Form_Check);
            getLabel().addClass(BSComponentFormGroupOptions.Form_Check_Label);
            removeClass(BSComponentFormGroupOptions.Form_Group);

            getLabel().add(getInputComponent());
            getLabel().setRenderTextBeforeChildren(false);
            add(getLabel());
        }
        super.preConfigure();
    }
}
