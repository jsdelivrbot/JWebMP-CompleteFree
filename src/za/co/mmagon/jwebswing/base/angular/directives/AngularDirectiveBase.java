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
package za.co.mmagon.jwebswing.base.angular.directives;

import za.co.mmagon.jwebswing.base.angular.AngularReferenceBase;

/**
 * An angular registered directive
 *
 * @author GedMarc
 * @since 24 Jul 2016
 */
public abstract class AngularDirectiveBase extends AngularReferenceBase
{

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a directive with this name that always sorts default
     *
     * @param directiveName This modules name
     */
    public AngularDirectiveBase(String directiveName)
    {
        super(directiveName);
    }

}
