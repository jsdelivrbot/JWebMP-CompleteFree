(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["kl-GL"] = $.extend(true, {}, en, {
        name: "kl-GL",
        englishName: "Greenlandic (Greenland)",
        nativeName: "kalaallisut (Kalaallit Nunaat)",
        language: "kl",
        numberFormat: {
            ',': ".",
            '.': ",",
            groupSizes: [3,0],
            percent: {
                groupSizes: [3,0],
                ',': ".",
                '.': ","
            },
            currency: {
                pattern: ["$ -n","$ n"],
                groupSizes: [3,0],
                ',': ".",
                '.': ",",
                symbol: "kr."
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                '/': "-",
                firstDay: 1,
                days: {
                    names: ["sapaat","ataasinngorneq","marlunngorneq","pingasunngorneq","sisamanngorneq","tallimanngorneq","arfininngorneq"],
                    namesAbbr: ["sap","ata","mar","ping","sis","tal","arf"],
                    namesShort: ["sa","at","ma","pi","si","ta","ar"]
                },
                months: {
                    names: ["januari","februari","martsi","apriili","maaji","juni","juli","aggusti","septembari","oktobari","novembari","decembari",""],
                    namesAbbr: ["jan","feb","mar","apr","mai","jun","jul","aug","sep","okt","nov","dec",""]
                },
                AM: null,
                PM: null,
                patterns: {
                    d: "dd-MM-yyyy",
                    D: "d. MMMM yyyy",
                    t: "HH:mm",
                    T: "HH:mm:ss",
                    f: "d. MMMM yyyy HH:mm",
                    F: "d. MMMM yyyy HH:mm:ss",
                    M: "d. MMMM",
                    Y: "MMMM yyyy"
                }
            })
        }
    }, cultures["kl-GL"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);