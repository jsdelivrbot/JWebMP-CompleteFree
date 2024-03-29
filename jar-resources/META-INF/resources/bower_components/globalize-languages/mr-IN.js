(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["mr-IN"] = $.extend(true, {}, en, {
        name: "mr-IN",
        englishName: "Marathi (India)",
        nativeName: "मराठी (भारत)",
        language: "mr",
        numberFormat: {
            groupSizes: [3,2],
            percent: {
                groupSizes: [3,2]
            },
            currency: {
                pattern: ["$ -n","$ n"],
                groupSizes: [3,2],
                symbol: "रु"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                '/': "-",
                firstDay: 1,
                days: {
                    names: ["रविवार","सोमवार","मंगळवार","बुधवार","गुरुवार","शुक्रवार","शनिवार"],
                    namesAbbr: ["रवि.","सोम.","मंगळ.","बुध.","गुरु.","शुक्र.","शनि."],
                    namesShort: ["र","स","म","ब","ग","श","श"]
                },
                months: {
                    names: ["जानेवारी","फेब्रुवारी","मार्च","एप्रिल","मे","जून","जुलै","ऑगस्ट","सप्टेंबर","ऑक्टोबर","नोव्हेंबर","डिसेंबर",""],
                    namesAbbr: ["जाने.","फेब्रु.","मार्च","एप्रिल","मे","जून","जुलै","ऑगस्ट","सप्टें.","ऑक्टो.","नोव्हें.","डिसें.",""]
                },
                AM: ["म.पू.","म.पू.","म.पू."],
                PM: ["म.नं.","म.नं.","म.नं."],
                patterns: {
                    d: "dd-MM-yyyy",
                    D: "dd MMMM yyyy",
                    t: "HH:mm",
                    T: "HH:mm:ss",
                    f: "dd MMMM yyyy HH:mm",
                    F: "dd MMMM yyyy HH:mm:ss",
                    M: "dd MMMM"
                }
            })
        }
    }, cultures["mr-IN"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);