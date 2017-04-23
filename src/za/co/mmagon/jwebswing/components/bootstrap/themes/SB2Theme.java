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
package za.co.mmagon.jwebswing.components.bootstrap.themes;

import za.co.mmagon.jwebswing.htmlbuilder.css.themes.Theme;

/**
 * The Bootstrap SB Admin 2 Theme
 *
 * @author GedMarc
 * @since 21 May 2016
 */
public class SB2Theme extends Theme
{

    private static final long serialVersionUID = 1L;

    public SB2Theme()
    {
        super("SBAdmin2", "");
        //default to sb2 admin theme?
        getCssReferences().add(SB2BootstrapReferencePool.BootstrapSBAdmin2Reference.getCssReference());
        getCssReferences().add(SB2BootstrapReferencePool.BootstrapSocialThemeReference.getCssReference());
    }

}
