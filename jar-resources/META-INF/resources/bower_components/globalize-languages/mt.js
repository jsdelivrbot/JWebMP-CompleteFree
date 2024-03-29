(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["mt"] = $.extend(true, {}, en, {
        name: "mt",
        englishName: "Maltese",
        nativeName: "Malti",
        language: "mt",
        numberFormat: {
            percent: {
                pattern: ["-%n","%n"]
            },
            currency: {
                pattern: ["-$n","$n"],
                symbol: "€"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                firstDay: 1,
                days: {
                    names: ["Il-Ħadd","It-Tnejn","It-Tlieta","L-Erbgħa","Il-Ħamis","Il-Ġimgħa","Is-Sibt"],
                    namesAbbr: ["Ħad","Tne","Tli","Erb","Ħam","Ġim","Sib"],
                    namesShort: ["I","I","I","L","I","I","I"]
                },
                months: {
                    names: ["Jannar","Frar","Marzu","April","Mejju","Ġunju","Lulju","Awissu","Settembru","Ottubru","Novembru","Diċembru",""],
                    namesAbbr: ["Jan","Fra","Mar","Apr","Mej","Ġun","Lul","Awi","Set","Ott","Nov","Diċ",""]
                },
                patterns: {
                    d: "dd/MM/yyyy",
                    D: "dddd, d' ta\\' 'MMMM yyyy",
                    t: "HH:mm",
                    T: "HH:mm:ss",
                    f: "dddd, d' ta\\' 'MMMM yyyy HH:mm",
                    F: "dddd, d' ta\\' 'MMMM yyyy HH:mm:ss",
                    M: "d' ta\\' 'MMMM",
                    Y: "MMMM yyyy"
                }
            })
        }
    }, cultures["mt"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);