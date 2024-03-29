(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["lo-LA"] = $.extend(true, {}, en, {
        name: "lo-LA",
        englishName: "Lao (Lao P.D.R.)",
        nativeName: "ລາວ (ສ.ປ.ປ. ລາວ)",
        language: "lo",
        numberFormat: {
            pattern: ["(n)"],
            groupSizes: [3,0],
            percent: {
                groupSizes: [3,0]
            },
            currency: {
                pattern: ["(n$)","n$"],
                groupSizes: [3,0],
                symbol: "₭"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                days: {
                    names: ["ວັນອາທິດ","ວັນຈັນ","ວັນອັງຄານ","ວັນພຸດ","ວັນພະຫັດ","ວັນສຸກ","ວັນເສົາ"],
                    namesAbbr: ["ອາທິດ","ຈັນ","ອັງຄານ","ພຸດ","ພະຫັດ","ສຸກ","ເສົາ"],
                    namesShort: ["ອ","ຈ","ອ","ພ","ພ","ສ","ເ"]
                },
                months: {
                    names: ["ມັງກອນ","ກຸມພາ","ມີນາ","ເມສາ","ພຶດສະພາ","ມິຖຸນາ","ກໍລະກົດ","ສິງຫາ","ກັນຍາ","ຕຸລາ","ພະຈິກ","ທັນວາ",""],
                    namesAbbr: ["ມັງກອນ","ກຸມພາ","ມີນາ","ເມສາ","ພຶດສະພາ","ມິຖຸນາ","ກໍລະກົດ","ສິງຫາ","ກັນຍາ","ຕຸລາ","ພະຈິກ","ທັນວາ",""]
                },
                AM: ["ເຊົ້າ","ເຊົ້າ","ເຊົ້າ"],
                PM: ["ແລງ","ແລງ","ແລງ"],
                patterns: {
                    d: "dd/MM/yyyy",
                    D: "dd MMMM yyyy",
                    t: "H:mm tt",
                    T: "HH:mm:ss",
                    f: "dd MMMM yyyy H:mm tt",
                    F: "dd MMMM yyyy HH:mm:ss",
                    M: "dd MMMM",
                    Y: "MMMM yyyy"
                }
            })
        }
    }, cultures["lo-LA"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);