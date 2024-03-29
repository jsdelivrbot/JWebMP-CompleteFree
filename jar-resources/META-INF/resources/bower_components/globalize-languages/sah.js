(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["sah"] = $.extend(true, {}, en, {
        name: "sah",
        englishName: "Yakut",
        nativeName: "саха",
        language: "sah",
        numberFormat: {
            ',': " ",
            '.': ",",
            percent: {
                pattern: ["-n%","n%"],
                ',': " ",
                '.': ","
            },
            currency: {
                pattern: ["-n$","n$"],
                ',': " ",
                '.': ",",
                symbol: "с."
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                '/': ".",
                firstDay: 1,
                days: {
                    names: ["баскыһыанньа","бэнидиэнньик","оптуорунньук","сэрэдэ","чэппиэр","бээтинсэ","субуота"],
                    namesAbbr: ["Бс","Бн","Оп","Ср","Чп","Бт","Сб"],
                    namesShort: ["Бс","Бн","Оп","Ср","Чп","Бт","Сб"]
                },
                months: {
                    names: ["Тохсунньу","Олунньу","Кулун тутар","Муус устар","Ыам ыйа","Бэс ыйа","От ыйа","Атырдьах ыйа","Балаҕан ыйа","Алтынньы","Сэтинньи","Ахсынньы",""],
                    namesAbbr: ["тхс","олн","кул","мст","ыам","бэс","отй","атр","блҕ","алт","стн","ахс",""]
                },
                monthsGenitive: {
                    names: ["тохсунньу","олунньу","кулун тутар","муус устар","ыам ыйын","бэс ыйын","от ыйын","атырдьах ыйын","балаҕан ыйын","алтынньы","сэтинньи","ахсынньы",""],
                    namesAbbr: ["тхс","олн","кул","мст","ыам","бэс","отй","атр","блҕ","алт","стн","ахс",""]
                },
                AM: null,
                PM: null,
                patterns: {
                    d: "MM.dd.yyyy",
                    D: "MMMM d yyyy 'с.'",
                    t: "H:mm",
                    T: "H:mm:ss",
                    f: "MMMM d yyyy 'с.' H:mm",
                    F: "MMMM d yyyy 'с.' H:mm:ss",
                    Y: "MMMM yyyy 'с.'"
                }
            })
        }
    }, cultures["sah"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);