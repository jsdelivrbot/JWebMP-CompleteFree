(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["en-BZ"] = $.extend(true, {}, en, {
        name: "en-BZ",
        englishName: "English (Belize)",
        nativeName: "English (Belize)",
        numberFormat: {
            currency: {
                groupSizes: [3,0],
                symbol: "BZ$"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                patterns: {
                    d: "dd/MM/yyyy",
                    D: "dddd, dd MMMM yyyy",
                    t: "hh:mm tt",
                    T: "hh:mm:ss tt",
                    f: "dddd, dd MMMM yyyy hh:mm tt",
                    F: "dddd, dd MMMM yyyy hh:mm:ss tt",
                    M: "dd MMMM",
                    Y: "MMMM yyyy"
                }
            })
        }
    }, cultures["en-BZ"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);