(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["mn-Mong-CN"] = $.extend(true, {}, en, {
        name: "mn-Mong-CN",
        englishName: "Mongolian (Traditional Mongolian, PRC)",
        nativeName: "ᠮᠤᠨᠭᠭᠤᠯ ᠬᠡᠯᠡ (ᠪᠦᠭᠦᠳᠡ ᠨᠠᠢᠷᠠᠮᠳᠠᠬᠤ ᠳᠤᠮᠳᠠᠳᠤ ᠠᠷᠠᠳ ᠣᠯᠣᠰ)",
        language: "mn-Mong",
        numberFormat: {
            groupSizes: [3,0],
            percent: {
                pattern: ["-n%","n%"],
                groupSizes: [3,0]
            },
            currency: {
                pattern: ["$-n","$n"],
                groupSizes: [3,0],
                symbol: "¥"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                firstDay: 1,
                days: {
                    names: ["ᠭᠠᠷᠠᠭ ᠤᠨ ᠡᠳᠦᠷ","ᠭᠠᠷᠠᠭ ᠤᠨ ᠨᠢᠭᠡᠨ","ᠭᠠᠷᠠᠭ ᠤᠨ ᠬᠣᠶᠠᠷ","ᠭᠠᠷᠠᠭ ᠤᠨ ᠭᠤᠷᠪᠠᠨ","ᠭᠠᠷᠠᠭ ᠤᠨ ᠳᠥᠷᠪᠡᠨ","ᠭᠠᠷᠠᠭ ᠤᠨ ᠲᠠᠪᠤᠨ","ᠭᠠᠷᠠᠭ ᠤᠨ ᠵᠢᠷᠭᠤᠭᠠᠨ"],
                    namesAbbr: ["ᠭᠠᠷᠠᠭ ᠤᠨ ᠡᠳᠦᠷ","ᠭᠠᠷᠠᠭ ᠤᠨ ᠨᠢᠭᠡᠨ","ᠭᠠᠷᠠᠭ ᠤᠨ ᠬᠣᠶᠠᠷ","ᠭᠠᠷᠠᠭ ᠤᠨ ᠭᠤᠷᠪᠠᠨ","ᠭᠠᠷᠠᠭ ᠤᠨ ᠳᠥᠷᠪᠡᠨ","ᠭᠠᠷᠠᠭ ᠤᠨ ᠲᠠᠪᠤᠨ","ᠭᠠᠷᠠᠭ ᠤᠨ ᠵᠢᠷᠭᠤᠭᠠᠨ"],
                    namesShort: ["ᠡ‍","ᠨᠢ‍","ᠬᠣ‍","ᠭᠤ‍","ᠳᠥ‍","ᠲᠠ‍","ᠵᠢ‍"]
                },
                months: {
                    names: ["ᠨᠢᠭᠡᠳᠦᠭᠡᠷ ᠰᠠᠷ᠎ᠠ","ᠬᠤᠶ᠋ᠠᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠭᠤᠷᠪᠠᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠲᠦᠷᠪᠡᠳᠦᠭᠡᠷ ᠰᠠᠷ᠎ᠠ","ᠲᠠᠪᠤᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠵᠢᠷᠭᠤᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠲᠤᠯᠤᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠨᠠᠢᠮᠠᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠶᠢᠰᠦᠳᠦᠭᠡᠷ ᠰᠠᠷ᠎ᠠ","ᠠᠷᠪᠠᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠠᠷᠪᠠᠨ ᠨᠢᠭᠡᠳᠦᠭᠡᠷ ᠰᠠᠷ᠎ᠠ","ᠠᠷᠪᠠᠨ ᠬᠤᠶ᠋ᠠᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ",""],
                    namesAbbr: ["ᠨᠢᠭᠡᠳᠦᠭᠡᠷ ᠰᠠᠷ᠎ᠠ","ᠬᠤᠶ᠋ᠠᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠭᠤᠷᠪᠠᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠲᠦᠷᠪᠡᠳᠦᠭᠡᠷ ᠰᠠᠷ᠎ᠠ","ᠲᠠᠪᠤᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠵᠢᠷᠭᠤᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠲᠤᠯᠤᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠨᠠᠢᠮᠠᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠶᠢᠰᠦᠳᠦᠭᠡᠷ ᠰᠠᠷ᠎ᠠ","ᠠᠷᠪᠠᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ","ᠠᠷᠪᠠᠨ ᠨᠢᠭᠡᠳᠦᠭᠡᠷ ᠰᠠᠷ᠎ᠠ","ᠠᠷᠪᠠᠨ ᠬᠤᠶ᠋ᠠᠳᠤᠭᠠᠷ ᠰᠠᠷ᠎ᠠ",""]
                },
                AM: null,
                PM: null,
                eras: [{"name":"ᠣᠨ ᠲᠣᠭᠠᠯᠠᠯ ᠤᠨ","start":null,"offset":0}],
                patterns: {
                    d: "yyyy/M/d",
                    D: "yyyy'ᠣᠨ ᠤ᠋' M'ᠰᠠᠷ᠎ᠠ  ᠢᠢᠨ 'd' ᠤ᠋ ᠡᠳᠦᠷ'",
                    t: "H:mm",
                    T: "H:mm:ss",
                    f: "yyyy'ᠣᠨ ᠤ᠋' M'ᠰᠠᠷ᠎ᠠ  ᠢᠢᠨ 'd' ᠤ᠋ ᠡᠳᠦᠷ' H:mm",
                    F: "yyyy'ᠣᠨ ᠤ᠋' M'ᠰᠠᠷ᠎ᠠ  ᠢᠢᠨ 'd' ᠤ᠋ ᠡᠳᠦᠷ' H:mm:ss",
                    M: "M'ᠰᠠᠷ᠎ᠠ' d'ᠡᠳᠦᠷ'",
                    Y: "yyyy'ᠣᠨ' M'ᠰᠠᠷ᠎ᠠ'"
                }
            })
        }
    }, cultures["mn-Mong-CN"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);