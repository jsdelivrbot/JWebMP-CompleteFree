(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["co"] = $.extend(true, {}, en, {
        name: "co",
        englishName: "Corsican",
        nativeName: "Corsu",
        language: "co",
        numberFormat: {
            ',': " ",
            '.': ",",
            percent: {
                ',': " ",
                '.': ","
            },
            currency: {
                pattern: ["-n $","n $"],
                ',': " ",
                '.': ",",
                symbol: "€"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                firstDay: 1,
                days: {
                    names: ["dumenica","luni","marti","mercuri","ghjovi","venderi","sabbatu"],
                    namesAbbr: ["dum.","lun.","mar.","mer.","ghj.","ven.","sab."],
                    namesShort: ["du","lu","ma","me","gh","ve","sa"]
                },
                months: {
                    names: ["ghjennaghju","ferraghju","marzu","aprile","maghju","ghjunghju","lugliu","aostu","settembre","ottobre","nuvembre","dicembre",""],
                    namesAbbr: ["ghje","ferr","marz","apri","magh","ghju","lugl","aost","sett","otto","nuve","dice",""]
                },
                AM: null,
                PM: null,
                eras: [{"name":"dopu J-C","start":null,"offset":0}],
                patterns: {
                    d: "dd/MM/yyyy",
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
    }, cultures["co"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);