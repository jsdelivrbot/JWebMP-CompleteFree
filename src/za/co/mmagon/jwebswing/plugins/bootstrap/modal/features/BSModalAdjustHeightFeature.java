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
package za.co.mmagon.jwebswing.plugins.bootstrap.modal.features;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.bootstrap.modal.BSModal;

/**
 * Dynamic heights
 * <p>
 * If the height of a modal changes while it is open, you should call $('#myModal').data('bs.modal').handleUpdate() to readjust the modal’s position in case a scrollbar appears.
 *
 * @author GedMarc
 * @since 21 Feb 2017
 *
 */
public class BSModalAdjustHeightFeature extends Feature
{

    private static final long serialVersionUID = 1L;

    public BSModalAdjustHeightFeature(BSModal modal)
    {
        super("BSModalDynamicHeightFeature", modal);
        setComponent(modal);
    }

    @Override
    protected void assignFunctionsToComponent()
    {
        addQuery(getComponent().getJQueryID() + ".data('bs.modal').handleUpdate();");
    }

}
