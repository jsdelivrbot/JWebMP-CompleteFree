(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["de-AT"] = $.extend(true, {}, en, {
        name: "de-AT",
        englishName: "German (Austria)",
        nativeName: "Deutsch (Österreich)",
        language: "de",
        numberFormat: {
            ',': ".",
            '.': ",",
            percent: {
                pattern: ["-n%","n%"],
                ',': ".",
                '.': ","
            },
            currency: {
                pattern: ["-$ n","$ n"],
                ',': ".",
                '.': ",",
                symbol: "€"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                '/': ".",
                firstDay: 1,
                days: {
                    names: ["Sonntag","Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag"],
                    namesAbbr: ["So","Mo","Di","Mi","Do","Fr","Sa"],
                    namesShort: ["So","Mo","Di","Mi","Do","Fr","Sa"]
                },
                months: {
                    names: ["Jänner","Februar","März","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember",""],
                    namesAbbr: ["Jän","Feb","Mär","Apr","Mai","Jun","Jul","Aug","Sep","Okt","Nov","Dez",""]
                },
                AM: null,
                PM: null,
                eras: [{"name":"n. Chr.","start":null,"offset":0}],
                patterns: {
                    d: "dd.MM.yyyy",
                    D: "dddd, dd. MMMM yyyy",
                    t: "HH:mm",
                    T: "HH:mm:ss",
                    f: "dddd, dd. MMMM yyyy HH:mm",
                    F: "dddd, dd. MMMM yyyy HH:mm:ss",
                    M: "dd MMMM",
                    Y: "MMMM yyyy"
                }
            })
        }
    }, cultures["de-AT"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);