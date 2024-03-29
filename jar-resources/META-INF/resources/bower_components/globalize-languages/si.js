(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["si"] = $.extend(true, {}, en, {
        name: "si",
        englishName: "Sinhala",
        nativeName: "සිංහල",
        language: "si",
        numberFormat: {
            groupSizes: [3,2],
            percent: {
                groupSizes: [3,2]
            },
            currency: {
                pattern: ["($ n)","$ n"],
                symbol: "රු."
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                '/': "-",
                firstDay: 1,
                days: {
                    names: ["ඉරිදා","සඳුදා","අඟහරුවාදා","බදාදා","බ්‍රහස්පතින්දා","සිකුරාදා","සෙනසුරාදා"],
                    namesAbbr: ["ඉරිදා","සඳුදා","කුජදා","බුදදා","ගුරුදා","කිවිදා","ශනිදා"],
                    namesShort: ["ඉ","ස","අ","බ","බ්‍ර","සි","සෙ"]
                },
                months: {
                    names: ["ජනවාරි","පෙබරවාරි","මාර්තු","අ‌ප්‍රේල්","මැයි","ජූනි","ජූලි","අ‌ගෝස්තු","සැප්තැම්බර්","ඔක්තෝබර්","නොවැම්බර්","දෙසැම්බර්",""],
                    namesAbbr: ["ජන.","පෙබ.","මාර්තු.","අප්‍රේල්.","මැයි.","ජූනි.","ජූලි.","අගෝ.","සැප්.","ඔක්.","නොවැ.","දෙසැ.",""]
                },
                AM: ["පෙ.ව.","පෙ.ව.","පෙ.ව."],
                PM: ["ප.ව.","ප.ව.","ප.ව."],
                eras: [{"name":"ක්‍රි.ව.","start":null,"offset":0}],
                patterns: {
                    d: "yyyy-MM-dd",
                    D: "yyyy MMMM' මස 'dd' වැනිදා 'dddd",
                    f: "yyyy MMMM' මස 'dd' වැනිදා 'dddd h:mm tt",
                    F: "yyyy MMMM' මස 'dd' වැනිදා 'dddd h:mm:ss tt",
                    Y: "yyyy MMMM"
                }
            })
        }
    }, cultures["si"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);