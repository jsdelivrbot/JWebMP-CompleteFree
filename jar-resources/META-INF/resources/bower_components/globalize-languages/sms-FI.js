(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["sms-FI"] = $.extend(true, {}, en, {
        name: "sms-FI",
        englishName: "Sami, Skolt (Finland)",
        nativeName: "sääm´ǩiõll (Lää´ddjânnam)",
        language: "sms",
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
                '/': ".",
                firstDay: 1,
                days: {
                    names: ["pâ´sspei´vv","vuõssargg","mââibargg","seärad","nelljdpei´vv","piâtnâc","sue´vet"],
                    namesAbbr: ["pâ","vu","mâ","se","ne","pi","su"],
                    namesShort: ["p","v","m","s","n","p","s"]
                },
                months: {
                    names: ["ođđee´jjmään","tä´lvvmään","pâ´zzlâšttammään","njuhččmään","vue´ssmään","ǩie´ssmään","suei´nnmään","på´rǧǧmään","čõhččmään","kålggmään","skamm´mään","rosttovmään",""],
                    namesAbbr: ["ođjm","tä´lvv","pâzl","njuh","vue","ǩie","suei","på´r","čõh","kålg","ska","rost",""]
                },
                monthsGenitive: {
                    names: ["ođđee´jjmannu","tä´lvvmannu","pâ´zzlâšttammannu","njuhččmannu","vue´ssmannu","ǩie´ssmannu","suei´nnmannu","på´rǧǧmannu","čõhččmannu","kålggmannu","skamm´mannu","rosttovmannu",""],
                    namesAbbr: ["ođjm","tä´lvv","pâzl","njuh","vue","ǩie","suei","på´r","čõh","kålg","ska","rost",""]
                },
                AM: null,
                PM: null,
                patterns: {
                    d: "d.M.yyyy",
                    D: "MMMM d'. p. 'yyyy",
                    t: "H:mm",
                    T: "H:mm:ss",
                    f: "MMMM d'. p. 'yyyy H:mm",
                    F: "MMMM d'. p. 'yyyy H:mm:ss",
                    M: "MMMM d'. p. '",
                    Y: "MMMM yyyy"
                }
            })
        }
    }, cultures["sms-FI"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);