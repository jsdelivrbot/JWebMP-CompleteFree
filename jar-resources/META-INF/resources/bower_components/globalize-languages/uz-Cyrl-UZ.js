(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["uz-Cyrl-UZ"] = $.extend(true, {}, en, {
        name: "uz-Cyrl-UZ",
        englishName: "Uzbek (Cyrillic, Uzbekistan)",
        nativeName: "Ўзбек (Ўзбекистон)",
        language: "uz-Cyrl",
        numberFormat: {
            ',': " ",
            '.': ",",
            percent: {
                pattern: ["-n%","n%"],
                ',': " ",
                '.': ","
            },
            currency: {
                pattern: ["-n $","n $"],
                ',': " ",
                '.': ",",
                symbol: "сўм"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                '/': ".",
                firstDay: 1,
                days: {
                    names: ["якшанба","душанба","сешанба","чоршанба","пайшанба","жума","шанба"],
                    namesAbbr: ["якш","дш","сш","чш","пш","ж","ш"],
                    namesShort: ["я","д","с","ч","п","ж","ш"]
                },
                months: {
                    names: ["Январ","Феврал","Март","Апрел","Май","Июн","Июл","Август","Сентябр","Октябр","Ноябр","Декабр",""],
                    namesAbbr: ["Янв","Фев","Мар","Апр","Май","Июн","Июл","Авг","Сен","Окт","Ноя","Дек",""]
                },
                monthsGenitive: {
                    names: ["январ","феврал","март","апрел","май","июн","июл","август","сентябр","октябр","ноябр","декабр",""],
                    namesAbbr: ["Янв","Фев","Мар","Апр","мая","Июн","Июл","Авг","Сен","Окт","Ноя","Дек",""]
                },
                AM: null,
                PM: null,
                patterns: {
                    d: "dd.MM.yyyy",
                    D: "yyyy 'йил' d-MMMM",
                    t: "HH:mm",
                    T: "HH:mm:ss",
                    f: "yyyy 'йил' d-MMMM HH:mm",
                    F: "yyyy 'йил' d-MMMM HH:mm:ss",
                    M: "d-MMMM",
                    Y: "MMMM yyyy"
                }
            })
        }
    }, cultures["uz-Cyrl-UZ"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);