(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["mi"] = $.extend(true, {}, en, {
        name: "mi",
        englishName: "Maori",
        nativeName: "Reo Māori",
        language: "mi",
        numberFormat: {
            percent: {
                pattern: ["-%n","%n"]
            },
            currency: {
                pattern: ["-$n","$n"]
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                firstDay: 1,
                days: {
                    names: ["Rātapu","Rāhina","Rātū","Rāapa","Rāpare","Rāmere","Rāhoroi"],
                    namesAbbr: ["Ta","Hi","Tū","Apa","Pa","Me","Ho"],
                    namesShort: ["Ta","Hi","Tū","Aa","Pa","Me","Ho"]
                },
                months: {
                    names: ["Kohi-tātea","Hui-tanguru","Poutū-te-rangi","Paenga-whāwhā","Haratua","Pipiri","Hōngongoi","Here-turi-kōkā","Mahuru","Whiringa-ā-nuku","Whiringa-ā-rangi","Hakihea",""],
                    namesAbbr: ["Kohi","Hui","Pou","Pae","Hara","Pipi","Hōngo","Here","Mahu","Nuku","Rangi","Haki",""]
                },
                AM: ["a.m.","a.m.","A.M."],
                PM: ["p.m.","p.m.","P.M."],
                patterns: {
                    d: "dd/MM/yyyy",
                    D: "dddd, dd MMMM, yyyy",
                    f: "dddd, dd MMMM, yyyy h:mm tt",
                    F: "dddd, dd MMMM, yyyy h:mm:ss tt",
                    M: "dd MMMM",
                    Y: "MMMM, yy"
                }
            })
        }
    }, cultures["mi"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);