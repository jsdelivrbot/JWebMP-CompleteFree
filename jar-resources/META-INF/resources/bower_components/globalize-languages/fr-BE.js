(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["fr-BE"] = $.extend(true, {}, en, {
        name: "fr-BE",
        englishName: "French (Belgium)",
        nativeName: "français (Belgique)",
        language: "fr",
        numberFormat: {
            ',': ".",
            '.': ",",
            percent: {
                ',': ".",
                '.': ","
            },
            currency: {
                pattern: ["$ -n","$ n"],
                ',': ".",
                '.': ",",
                symbol: "€"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                firstDay: 1,
                days: {
                    names: ["dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi"],
                    namesAbbr: ["dim.","lun.","mar.","mer.","jeu.","ven.","sam."],
                    namesShort: ["di","lu","ma","me","je","ve","sa"]
                },
                months: {
                    names: ["janvier","février","mars","avril","mai","juin","juillet","août","septembre","octobre","novembre","décembre",""],
                    namesAbbr: ["janv.","févr.","mars","avr.","mai","juin","juil.","août","sept.","oct.","nov.","déc.",""]
                },
                AM: null,
                PM: null,
                eras: [{"name":"ap. J.-C.","start":null,"offset":0}],
                patterns: {
                    d: "d/MM/yyyy",
                    D: "dddd d MMMM yyyy",
                    t: "HH:mm",
                    T: "HH:mm:ss",
                    f: "dddd d MMMM yyyy HH:mm",
                    F: "dddd d MMMM yyyy HH:mm:ss",
                    M: "d MMMM",
                    Y: "MMMM yyyy"
                }
            })
        }
    }, cultures["fr-BE"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);