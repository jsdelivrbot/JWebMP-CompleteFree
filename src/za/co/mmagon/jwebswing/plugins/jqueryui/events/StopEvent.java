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
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.stop.StopAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.draggable.JQUIDraggableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.resizable.JQUIResizableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.slider.JQUISliderEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.spinner.JQUISpinnerEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class StopEvent extends StopAdapter
        implements JQUIDraggableEvents, JQUIResizableEvents, JQUISliderEvents, JQUISpinnerEvents
{

    private static final long serialVersionUID = 1L;

    public StopEvent(Component component)
    {
        super(component);
    }
}