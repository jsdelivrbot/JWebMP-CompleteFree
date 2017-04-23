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
package za.co.mmagon.jwebswing.plugins.bootstrap.listgroup;

import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;

/**
 * Links and buttons Use &gt;a&lt;s or &gt;button&lt;s to create actionable list group items with hover, disabled, and active states by adding .list-group-item-action. We separate these pseudo-classes
 * to ensure list groups made of non-interactive elements (like &gt;li&lt;s or &gt;div&lt;s) don’t provide a click or tap affordance.
 *
 * @author GedMarc
 * @since 19 Jan 2017
 *
 */
public class BSListGroupButtonItem extends BSListGroupListItem
{

    private static final long serialVersionUID = 1L;

    /**
     * Links and buttons Use &gt;a&lt;s or &gt;button&lt;s to create actionable list group items with hover, disabled, and active states by adding .list-group-item-action. We separate these
     * pseudo-classes to ensure list groups made of non-interactive elements (like &gt;li&lt;s or &gt;div&lt;s) don’t provide a click or tap affordance.
     */
    public BSListGroupButtonItem()
    {
        setTag("button");
        addAttribute(GlobalAttributes.Type, "button");
        addClass(BSComponentListGroupOptions.List_Group_Item_Action);
    }
}
