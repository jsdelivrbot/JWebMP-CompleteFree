(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["hu"] = $.extend(true, {}, en, {
        name: "hu",
        englishName: "Hungarian",
        nativeName: "magyar",
        language: "hu",
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
                symbol: "Ft"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                '/': ".",
                firstDay: 1,
                days: {
                    names: ["vasárnap","hétfő","kedd","szerda","csütörtök","péntek","szombat"],
                    namesAbbr: ["V","H","K","Sze","Cs","P","Szo"],
                    namesShort: ["V","H","K","Sze","Cs","P","Szo"]
                },
                months: {
                    names: ["január","február","március","április","május","június","július","augusztus","szeptember","október","november","december",""],
                    namesAbbr: ["jan.","febr.","márc.","ápr.","máj.","jún.","júl.","aug.","szept.","okt.","nov.","dec.",""]
                },
                AM: ["de.","de.","DE."],
                PM: ["du.","du.","DU."],
                eras: [{"name":"i.sz.","start":null,"offset":0}],
                patterns: {
                    d: "yyyy.MM.dd.",
                    D: "yyyy. MMMM d.",
                    t: "H:mm",
                    T: "H:mm:ss",
                    f: "yyyy. MMMM d. H:mm",
                    F: "yyyy. MMMM d. H:mm:ss",
                    M: "MMMM d.",
                    Y: "yyyy. MMMM"
                }
            })
        }
    }, cultures["hu"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);