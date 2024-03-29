(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["ky"] = $.extend(true, {}, en, {
        name: "ky",
        englishName: "Kyrgyz",
        nativeName: "Кыргыз",
        language: "ky",
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
                '.': "-",
                symbol: "сом"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                '/': ".",
                firstDay: 1,
                days: {
                    names: ["Жекшемби","Дүйшөмбү","Шейшемби","Шаршемби","Бейшемби","Жума","Ишемби"],
                    namesAbbr: ["Жш","Дш","Шш","Шр","Бш","Жм","Иш"],
                    namesShort: ["Жш","Дш","Шш","Шр","Бш","Жм","Иш"]
                },
                months: {
                    names: ["Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь",""],
                    namesAbbr: ["Янв","Фев","Мар","Апр","Май","Июн","Июл","Авг","Сен","Окт","Ноя","Дек",""]
                },
                AM: null,
                PM: null,
                patterns: {
                    d: "dd.MM.yy",
                    D: "d'-'MMMM yyyy'-ж.'",
                    t: "H:mm",
                    T: "H:mm:ss",
                    f: "d'-'MMMM yyyy'-ж.' H:mm",
                    F: "d'-'MMMM yyyy'-ж.' H:mm:ss",
                    M: "d MMMM",
                    Y: "MMMM yyyy'-ж.'"
                }
            })
        }
    }, cultures["ky"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);