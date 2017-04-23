(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["lt"] = $.extend(true, {}, en, {
        name: "lt",
        englishName: "Lithuanian",
        nativeName: "lietuvių",
        language: "lt",
        numberFormat: {
            ',': ".",
            '.': ",",
            percent: {
                pattern: ["-n%","n%"],
                ',': ".",
                '.': ","
            },
            currency: {
                pattern: ["-n $","n $"],
                ',': ".",
                '.': ",",
                symbol: "Lt"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                '/': ".",
                firstDay: 1,
                days: {
                    names: ["sekmadienis","pirmadienis","antradienis","trečiadienis","ketvirtadienis","penktadienis","šeštadienis"],
                    namesAbbr: ["Sk","Pr","An","Tr","Kt","Pn","Št"],
                    namesShort: ["S","P","A","T","K","Pn","Š"]
                },
                months: {
                    names: ["sausis","vasaris","kovas","balandis","gegužė","birželis","liepa","rugpjūtis","rugsėjis","spalis","lapkritis","gruodis",""],
                    namesAbbr: ["Sau","Vas","Kov","Bal","Geg","Bir","Lie","Rgp","Rgs","Spl","Lap","Grd",""]
                },
                monthsGenitive: {
                    names: ["sausio","vasario","kovo","balandžio","gegužės","birželio","liepos","rugpjūčio","rugsėjo","spalio","lapkričio","gruodžio",""],
                    namesAbbr: ["Sau","Vas","Kov","Bal","Geg","Bir","Lie","Rgp","Rgs","Spl","Lap","Grd",""]
                },
                AM: null,
                PM: null,
                patterns: {
                    d: "yyyy.MM.dd",
                    D: "yyyy 'm.' MMMM d 'd.'",
                    t: "HH:mm",
                    T: "HH:mm:ss",
                    f: "yyyy 'm.' MMMM d 'd.' HH:mm",
                    F: "yyyy 'm.' MMMM d 'd.' HH:mm:ss",
                    M: "MMMM d 'd.'",
                    Y: "yyyy 'm.' MMMM"
                }
            })
        }
    }, cultures["lt"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);