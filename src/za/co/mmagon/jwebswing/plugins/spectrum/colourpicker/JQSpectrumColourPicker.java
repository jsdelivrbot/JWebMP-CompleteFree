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
package za.co.mmagon.jwebswing.plugins.spectrum.colourpicker;

import za.co.mmagon.jwebswing.base.html.InputTextType;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * The Spectrum Colour Picker Implementation
 * <p>
 * http://bgrins.github.com/spectrum
 * <p>
 * @author GedMarc
 * @since 01 May 2015
 */
@ComponentInformation(name = "Spectrum Colour Picker", description = "A full featured colour picker", url = "https://bgrins.github.io/spectrum/")
public class JQSpectrumColourPicker extends InputTextType
{

    private static final long serialVersionUID = 1L;
    private final JQSpectrumColourPickerFeature feature;

    /**
     * Constructs a new colour picker
     */
    public JQSpectrumColourPicker()
    {
        feature = new JQSpectrumColourPickerFeature(this);
        addFeature(feature);
    }

    /**
     * Returns the features available options
     *
     * @return
     */
    @Override
    public JQSpectrumColourPickerOptions getOptions()
    {
        return feature.getOptions();
    }
}
