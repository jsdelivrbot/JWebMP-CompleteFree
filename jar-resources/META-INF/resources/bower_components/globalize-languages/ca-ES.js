(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["ca-ES"] = $.extend(true, {}, en, {
        name: "ca-ES",
        englishName: "Catalan (Catalan)",
        nativeName: "català (català)",
        language: "ca",
        numberFormat: {
            ',': ".",
            '.': ",",
            percent: {
                ',': ".",
                '.': ","
            },
            currency: {
                pattern: ["-n $","n $"],
                ',': ".",
                '.': ",",
                symbol: "€"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                firstDay: 1,
                days: {
                    names: ["diumenge","dilluns","dimarts","dimecres","dijous","divendres","dissabte"],
                    namesAbbr: ["dg.","dl.","dt.","dc.","dj.","dv.","ds."],
                    namesShort: ["dg","dl","dt","dc","dj","dv","ds"]
                },
                months: {
                    names: ["gener","febrer","març","abril","maig","juny","juliol","agost","setembre","octubre","novembre","desembre",""],
                    namesAbbr: ["gen","feb","març","abr","maig","juny","jul","ag","set","oct","nov","des",""]
                },
                AM: null,
                PM: null,
                eras: [{"name":"d.C.","start":null,"offset":0}],
                patterns: {
                    d: "dd/MM/yyyy",
                    D: "dddd, d' / 'MMMM' / 'yyyy",
                    t: "HH:mm",
                    T: "HH:mm:ss",
                    f: "dddd, d' / 'MMMM' / 'yyyy HH:mm",
                    F: "dddd, d' / 'MMMM' / 'yyyy HH:mm:ss",
                    M: "dd MMMM",
                    Y: "MMMM' / 'yyyy"
                }
            })
        }
    }, cultures["ca-ES"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);