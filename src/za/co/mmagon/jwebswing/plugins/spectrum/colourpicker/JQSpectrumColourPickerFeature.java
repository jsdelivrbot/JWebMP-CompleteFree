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

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.pools.jqspectrum.JQSpectrumColourPickerReferencePool;

/**
 * An implementation of the Spectrum Colour Picker tool
 * <p>
 * <p>
 * http://bgrins.github.io/spectrum/#why
 * <p>
 * @author MMagon
 * @since 25 Jun 2013
 * @version 1.0
 */
public class JQSpectrumColourPickerFeature extends Feature<JQSpectrumColourPickerOptions, JQSpectrumColourPickerFeature>
{

    private static final long serialVersionUID = 1L;
    private JQSpectrumColourPickerOptions colourOptions;
    private final JQSpectrumColourPicker picker;

    /**
     * Constructs a new instance of the JW Colour Picker ComponentFeatureBase
     */
    public JQSpectrumColourPickerFeature(JQSpectrumColourPicker picker)
    {
        super("JWColourPickerFeature");
        this.picker = picker;
        getJavascriptReferences().add(JQSpectrumColourPickerReferencePool.SpectrumColourPicker.getJavaScriptReference());
        getCssReferences().add(JQSpectrumColourPickerReferencePool.SpectrumColourPicker.getCssReference());

    }

    @Override
    public void assignFunctionsToComponent()
    {
        String s = picker.getJQueryID() + "spectrum(" + getOptions() + ");" + getNewLine();
        addQuery(s);
    }

    /**
     * Returns the options associated with the Spectrum Colour Picker
     * <p>
     * @return
     */
    @Override
    public JQSpectrumColourPickerOptions getOptions()
    {
        if (this.colourOptions == null)
        {
            colourOptions = new JQSpectrumColourPickerOptions();
        }
        return colourOptions;
    }

    /**
     * Returns the JQUIColourPicker associated with this feature
     * <p>
     * @return
     */
    public JQSpectrumColourPicker getPicker()
    {
        return picker;
    }

}
