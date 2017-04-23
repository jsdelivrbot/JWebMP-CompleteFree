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
package za.co.mmagon.jwebswing.plugins.bootstrap.navs;

import za.co.mmagon.jwebswing.plugins.bootstrap.dropdown.BSDropDown;
import za.co.mmagon.jwebswing.plugins.bootstrap.dropdown.BSDropDownButton;
import za.co.mmagon.jwebswing.plugins.bootstrap.dropdown.BSDropDownLink;

/**
 *
 * @author GedMarc
 * @since 19 Jan 2017
 *
 */
public class BSNavItemDropDown extends BSDropDown implements BSNavsChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * A drop down that can be placed on any nav bar
     */
    public BSNavItemDropDown()
    {
        getDropdownButton().getClasses().add(0, BSComponentNavsOptions.Nav_Link.toString());
        getClasses().add(0, BSComponentNavsOptions.Nav_Item.toString());
        setTag("li");
    }

    /**
     * A drop down that can be placed on any nav bar
     *
     * @param link
     */
    public BSNavItemDropDown(BSDropDownLink link)
    {
        super(link);
        getDropdownButton().getClasses().add(0, BSComponentNavsOptions.Nav_Link.toString());
        getClasses().add(0, BSComponentNavsOptions.Nav_Item.toString());
        setTag("li");
    }

    /**
     * A drop down that can be placed on any nav bar
     *
     * @param button
     */
    public BSNavItemDropDown(BSDropDownButton button)
    {
        super(button);
        getDropdownButton().getClasses().add(0, BSComponentNavsOptions.Nav_Link.toString());
        getClasses().add(0, BSComponentNavsOptions.Nav_Item.toString());
        setTag("li");
    }

}
