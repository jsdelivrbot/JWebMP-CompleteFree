/* 
 * Copyright (C) 2016 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * JQuery Implementation
 */
(function ($)
{
    $.fn.jqRulerGuides = function (opts) {
        opts = $.extend({}, $.fn.jqRulerGuides.defaults, opts);
        var doc = opts.doc,
                body = opts.body,
                locked = opts.locked,
                dialogs = opts.dialogs,
                snapDialog = opts.snapDialog,
                openGridDialog = opts.openGridDialog,
                xSnap = opts.xSnap,
                ySnap = opts.ySnap,
                mode = opts.Mode,
                guides = opts.guides,
                guidesCnt = opts.guidesCnt,
                gUid = opts.gUid,
                rulerStatus = opts.rulerStatus,
                guideStatus = opts.guideStatus,
                hBound = opts.hBound,
                vBound = opts.vBound,
                gridListLen = opts.gridListLen,
                detailsStatus = opts.detailsStatus,
                domElements = opts.domElements,
                domDimensions = opts.domDimensions,
                snapDom = opts.snapDom;


        var wrapper = null,
                lockHandler = null,
                hRuler = null,
                vRuler = null,
                menu = null,
                gridList = null,
                menuBtn = null,
                gInfoBlockWrapper = null,
                resizeTimer = null;

        var cssText = 'html,body{margin:0;padding:0}.rg-overlay{position:absolute;top:0;left:0;overflow:hidden}.guide{position:absolute;top:0;left:0;z-index:9991;font-size:0}.guide.v{width:1px;height:7000px;border-right:solid 1px #00f;cursor:col-resize}.guide.h{width:3000px;height:1px;border-bottom:solid 1px #00f;cursor:row-resize}.info{width:50px;height:25px;line-height:25px;text-align:center;position:relative;font-size:13px;background-color:#eee;border:solid 1px #ccc;color:#000}.guide.v .info{left:2px}.guide.h .info{top:2px}.unselectable{-moz-user-select:-moz-none;-khtml-user-select:none;-webkit-user-select:none;-ms-user-select:none;user-select:none}.ruler{background-color:#ccc;position:absolute;top:0;left:0;z-index:9990}.ruler .label{font:12px Arial;color:#000}.ruler,.ruler span{font-size:0}.ruler.h{width:3000px;left:-1px;padding-top:14px;border-bottom:solid 1px #000}.ruler.v{height:7000px;top:-1px;padding-left:16px;width:25px;border-right:solid 1px #000}.ruler.h span{border-left:solid 1px #999;height:9px;width:1px;vertical-align:bottom;display:inline-block;*display:inline;zoom:1}.ruler.v span{display:block;margin-left:auto;margin-right:0;border-top:solid 1px #999;width:9px;height:1px}.ruler.v span.major{border-top:solid 1px #000;width:13px}.ruler.v span.milestone{position:relative;border-top:solid 1px #000;width:17px}.ruler.v span.label{border:0;font-size:9px;position:absolute;text-align:center;width:9px}.ruler.h span.major{border-left:solid 1px #000;height:13px}.ruler.h span.milestone{position:relative;border-left:solid 1px #000;height:17px}.ruler.h span.label{border:0;font-size:9px;position:absolute;text-align:center;top:-14px;width:9px}.ruler.h .l10{left:-5px}.ruler.h .l100{left:-7px}.ruler.h .l1000{left:-10px}.ruler.v .l10,.ruler.v .l100,.ruler.v .l1000{top:-7px}.ruler.v .l10{left:-12px}.ruler.v .l100{left:-17px}.ruler.v .l1000{left:-23px}.menu-btn{position:fixed;left:3px;top:2px;line-height:9px;z-index:9998;width:20px;height:20px;background-color:red;opacity:.5;font-size:20px;text-align:left;color:#fff;font-weight:700;cursor:pointer;border-radius:2px}.rg-menu{position:fixed;top:22px;left:3px;padding:0;margin:0;list-style:0;display:none;font:13px Arial;z-index:9999;box-shadow:2px 2px 10px #ccc}.rg-menu li{text-align:left;border-bottom:solid 1px #999;padding:0}.rg-menu a{background-color:#777;display:block;padding:5px;text-decoration:none;color:#fff;line-height:18px}.rg-menu a:hover,.rg-menu a.selected{color:#fff;background-color:#3b94ec}.rg-menu a.disabled{color:#ccc}.rg-menu .desc{display:inline-block;width:170px}.dialog{position:fixed;background-color:#777;z-index:9999;color:#fff;font-size:13px;display:none;box-shadow:2px 2px 10px #ccc}.dialog button{border:0;color:#333;cursor:pointer;background-color:#eaeaea;background-image:linear-gradient(#fafafa,#eaeaea);background-repeat:repeat-x;border-radius:3px;text-shadow:0 1px 0 rgba(255,255,255,.9)}.dialog input,.dialog select,.dialog button{font-size:13px;margin:3px;padding:3px}.dialog .title-bar{padding:5px;background-color:#aaa;font-weight:700}.dialog .wrapper{padding:10px}.open-dialog select,.open-dialog button{float:left;display:block}.open-dialog .ok-btn,.open-dialog .cancel-btn{margin:10px 3px}.open-dialog .ok-btn{clear:both}.snap-dialog label{font-weight:700;padding:3px}.snap-dialog .ok-btn{margin-left:18px}.snap-dialog .ok-btn,.snap-dialog .cancel-btn{margin-top:10px}.snap-dialog .rg-y-label{margin-left:10px}#rg-x-snap,#rg-y-snap{width:50px}.info-block-wrapper{position:absolute;z-index:9989}.info-block{position:absolute;text-align:left}.info-block.even{background:0 0;background-color:rgba(0,0,255,.2);-ms-filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#330000FF, endColorstr=#330000FF);filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#330000FF, endColorstr=#330000FF);zoom:1}.info-block.odd{background:0 0;background-color:rgba(255,0,0,.2);-ms-filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#33FF0000, endColorstr=#33FF0000);filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#33FF0000, endColorstr=#33FF0000);zoom:1}.info-block-txt{padding:5px;display:inline-block;vertical-align:top;background-color:#777;color:#fff;font-size:13px;*display:inline;zoom:1}',
                Ruler = function (type, size) {
                    var ruler = doc.createElement('div'),
                            i = 0,
                            span = doc.createElement('span'),
                            label = null,
                            labelTxt = null,
                            spanFrag = doc.createDocumentFragment(),
                            cnt = Math.floor(size / 2);
                    ruler.className = 'ruler ' + type + ' unselectable';
                    for (i; i < cnt; i = i + 1) {
                        span = span.cloneNode(false);
                        if (i % 25 === 0) {
                            span.className = 'milestone';
                            if (i > 0) {
                                label = span.cloneNode(false);
                                label.className = 'label';
                                if (i < 50) {
                                    label.className += ' l10';
                                } else if (i >= 50 && i < 500) {
                                    label.className += ' l100';
                                } else if (i >= 500) {
                                    label.className += ' l1000';
                                }

                                labelTxt = doc.createTextNode(i * 2);
                                label.appendChild(labelTxt);
                                span.appendChild(label);
                            }

                            span.className = 'milestone';
                        } else if (i % 5 === 0) {
                            span.className = 'major';
                        } else {
                            span.className = '';
                            span.removeAttribute('class');
                        }

                        spanFrag.appendChild(span);
                    }

                    ruler.appendChild(spanFrag);
                    return ruler;
                },
                getWindowSize = function () {
                    var w = Math.max(
                            body.scrollWidth,
                            body.offsetWidth,
                            doc.clientWidth,
                            doc.scrollWidth,
                            doc.offsetWidth
                            ),
                            h = Math.max(
                                    body.scrollHeight,
                                    body.offsetHeight,
                                    doc.clientHeight,
                                    doc.scrollHeight,
                                    doc.offsetHeight
                                    );
                    return [w, h];
                },
                getScrollPos = function () {
                    var t = Math.max(doc.scrollTop, body.scrollTop),
                            l = Math.max(doc.scrollLeft, body.scrollLeft);
                    return [t, l];
                },
                getScrollSize = function () {
                    var w = Math.max(doc.scrollWidth, body.scrollWidth),
                            h = Math.max(doc.scrollHeight, body.scrollHeight);
                    return [w, h];
                },
                closeAllDialogs = function () {
                    var i = 0;
                    for (i; i < dialogs.length; i = i + 1) {
                        dialogs[i].close();
                    }
                },
                removeInboundGuide = function (guide, gUid) {
                    var scrollPos = getScrollPos();
                    if (
                            rulerStatus === 1 && guideStatus === 1 && (
                                    (guide.className === 'guide h draggable' && guide.offsetTop < hBound + scrollPos[0]) ||
                                    (guide.className === 'guide v draggable' && guide.offsetLeft < vBound + scrollPos[1])
                                    )
                            ) {
                        wrapper.removeChild(guide);
                        delete guides[gUid];
                        guidesCnt = guidesCnt - 1;
                    }
                },
                removeInboundGuides = function () {
                    var i;
                    for (i in guides) {
                        if (guides.hasOwnProperty(i)) {
                            removeInboundGuide(guides[i], i);
                        }
                    }
                },
                toggleGuides = function () {
                    var i;
                    guideStatus = 1 - guideStatus;
                    for (i in guides) {
                        if (guides.hasOwnProperty(i)) {
                            guides[i].style.display = (guideStatus === 1)
                                    ? 'block'
                                    : 'none';
                        }
                    }

                    if (guideStatus === 1) {
                        wrapper.style.display = 'block';
                    }
                },
                toggleRulers = function () {
                    rulerStatus = 1 - rulerStatus;
                    if (rulerStatus === 1) {
                        vRuler.style.display = 'block';
                        hRuler.style.display = 'block';
                        wrapper.style.display = 'block';
                        removeInboundGuides();
                    } else {
                        vRuler.style.display = 'none';
                        hRuler.style.display = 'none';
                    }
                },
                removeGrid = function (gridName) {
                    if (gridList[gridName] !== undefined) {
                        delete gridList[gridName];
                        window.localStorage.setItem('RulersGuides', JSON.stringify(gridList));
                        gridListLen = gridListLen - 1;
                    }
                },
                deleteGuides = function () {
                    var i;
                    if (guidesCnt > 0) {
                        for (i in guides) {
                            if (guides.hasOwnProperty(i)) {
                                wrapper.removeChild(guides[i]);
                                delete guides[i];
                                guidesCnt = guidesCnt - 1;
                            }
                        }

                        gInfoBlockWrapper.style.display = 'none';
                    }
                },
                renderGrid = function (gridName) {
                    if (gridList[gridName] !== undefined) {
                        var grid = gridList[gridName],
                                guideId = null,
                                guideElem = null;
                        deleteGuides();
                        for (guideId in grid) {
                            if (grid.hasOwnProperty(guideId)) {
                                guideElem = doc.createElement('div');
                                guideElem.id = guideId;
                                guideElem.className = grid[guideId].cssClass;
                                guideElem.style.cssText = grid[guideId].style;
                                wrapper.appendChild(guideElem);
                                guides[guideId] = guideElem;
                                guidesCnt = guidesCnt + 1;
                            }
                        }
                    }
                },
                OpenGridDialog = function () {
                    var dialog = null,
                            self = this,
                            select = null,
                            renderSelect = function (insertOrUpdate) {
                                var gridName,
                                        options = '',
                                        i;
                                gridListLen = 0;
                                if (window.localStorage) {
                                    gridList = JSON.parse(window.localStorage.getItem('RulersGuides'));
                                    for (i in gridList) {
                                        if (gridList.hasOwnProperty(i)) {
                                            gridListLen = gridListLen + 1;
                                        }
                                    }
                                }

                                if (insertOrUpdate === 0) {
                                    select = doc.createElement('select');
                                    select.id = 'grid-list';
                                }

                                if (gridListLen > 0) {
                                    for (gridName in gridList) {
                                        if (gridList.hasOwnProperty(gridName)) {
                                            options += '<option>' + gridName + '</option>';
                                        }
                                    }

                                    select.innerHTML = options;
                                }

                                return select;
                            };
                    this.render = function () {
                        if (dialog === null) {
                            dialog = doc.createElement('div');
                            select = renderSelect(0);
                            var text = doc.createTextNode(''),
                                    titleBar = dialog.cloneNode(false),
                                    dialogWrapper = dialog.cloneNode(false),
                                    okBtn = doc.createElement('button'),
                                    cancelBtn = okBtn.cloneNode(false),
                                    delBtn = okBtn.cloneNode(false),
                                    titleBarTxt = text.cloneNode(false),
                                    okBtnTxt = text.cloneNode(false),
                                    cancelBtnTxt = text.cloneNode(false),
                                    delBtnTxt = text.cloneNode(false);
                            titleBarTxt.nodeValue = 'Open grid';
                            okBtnTxt.nodeValue = 'OK';
                            cancelBtnTxt.nodeValue = 'Cancel';
                            delBtnTxt.nodeValue = 'Delete';
                            dialog.className = 'dialog open-dialog';
                            titleBar.className = 'title-bar';
                            dialogWrapper.className = 'wrapper';
                            okBtn.className = 'ok-btn';
                            cancelBtn.className = 'cancel-btn';
                            delBtn.className = 'del-btn';
                            titleBar.appendChild(titleBarTxt);
                            okBtn.appendChild(okBtnTxt);
                            cancelBtn.appendChild(cancelBtnTxt);
                            delBtn.appendChild(delBtnTxt);
                            dialogWrapper.appendChild(select);
                            dialogWrapper.appendChild(delBtn);
                            dialogWrapper.appendChild(okBtn);
                            dialogWrapper.appendChild(cancelBtn);
                            dialog.appendChild(titleBar);
                            dialog.appendChild(dialogWrapper);
                            body.appendChild(dialog);
                            evt.attach('click', delBtn, function () {
                                if (window.confirm('Are you sure ?')) {
                                    if (select.options.length > 0) {
                                        removeGrid(select.options[select.selectedIndex].value);
                                        select.removeChild(
                                                select.options[select.selectedIndex]
                                                );
                                    }

                                    if (select.options.length === 0) {
                                        self.close();
                                    }
                                }
                            });
                            evt.attach('click', okBtn, function () {
                                renderGrid(select.value);
                                self.close();
                            });
                            evt.attach('click', cancelBtn, function () {
                                self.close();
                            });
                        }
                    };
                    this.render();
                    this.open = function () {
                        closeAllDialogs();
                        renderSelect(1);
                        if (gridListLen > 0) {
                            dialog.style.display = 'block';
                            dialog.style.left = ((doc.clientWidth - dialog.clientWidth) / 2) + 'px';
                            dialog.style.top = ((doc.clientHeight - dialog.clientHeight) / 2) + 'px';
                        }
                    };
                    this.close = function () {
                        dialog.style.display = 'none';
                    };
                },
                toggleRulersLock = function () {
                    if (locked === 0) {
                        if (lockHandler !== null) {
                            evt.detach('scroll', window, lockHandler);
                        }
                    } else {
                        lockHandler = evt.attach('scroll', window, function () {
                            var pos = getScrollPos(),
                                    size = getScrollSize();
                            hRuler.style.top = pos[0] + 'px';
                            wrapper.style.height = size[1] + 'px';
                            vRuler.style.left = pos[1] + 'px';
                            wrapper.style.width = size[0] + 'px';
                        });
                    }

                    locked = 1 - locked;
                },
                saveGrid = function () {
                    var data = {},
                            gridData = {},
                            i,
                            gridName = '';
                    while (gridName === '' && guidesCnt > 0) {
                        gridName = window.prompt('Save grid as');
                        if (gridName !== '' && gridName !== false && gridName !== null && window.localStorage) {
                            for (i in guides) {
                                if (guides.hasOwnProperty(i)) {
                                    gridData[i] = {
                                        'cssClass': guides[i].className,
                                        'style': guides[i].style.cssText
                                    };
                                }
                            }

                            if (window.localStorage.getItem('RulersGuides') !== null) {
                                data = JSON.parse(window.localStorage.getItem('RulersGuides'));
                            }

                            data[gridName] = gridData;
                            window.localStorage.setItem('RulersGuides', JSON.stringify(data));
                            gridListLen = gridListLen + 1;
                        }
                    }
                },
                showDetailedInfo = function () {
                    var i,
                            j = 0,
                            hGuides = [],
                            vGuides = [],
                            scrollSize = getScrollSize(),
                            infoBlockWrapper = doc.createElement('div'),
                            infoFrag = doc.createDocumentFragment(),
                            infoBlock = infoBlockWrapper.cloneNode(false),
                            infoBlockTxt = infoBlockWrapper.cloneNode(false),
                            infoData1 = doc.createTextNode(''),
                            infoData2 = infoData1.cloneNode(false),
                            text = '',
                            br = doc.createElement('br');
                    for (i in guides) {
                        if (guides.hasOwnProperty(i)) {
                            if (guides[i].type === 'h') {
                                hGuides.push(guides[i].y);
                            } else {
                                vGuides.push(guides[i].x);
                            }
                        }
                    }

                    vGuides.unshift(0);
                    vGuides.push(scrollSize[0]);
                    hGuides.unshift(0);
                    hGuides.push(scrollSize[1]);
                    vGuides = vGuides.sort(function (a, b) {
                        return a - b;
                    });
                    hGuides = hGuides.sort(function (a, b) {
                        return a - b;
                    });
                    for (i = 0; i < hGuides.length - 1; i = i + 1) {
                        j = 0;
                        for (j; j < vGuides.length - 1; j = j + 1) {
                            infoBlock = infoBlock.cloneNode(false);
                            infoBlockTxt = infoBlockTxt.cloneNode(false);
                            infoData1 = infoData1.cloneNode(false);
                            infoData2 = infoData2.cloneNode(false);
                            br = br.cloneNode();
                            infoBlockWrapper.className = 'info-block-wrapper';
                            infoBlock.className = 'info-block';
                            infoBlockTxt.className = 'info-block-txt';
                            infoBlock.className += (
                                    (i % 2 !== 0 && j % 2 !== 0) ||
                                    (i % 2 === 0 && j % 2 === 0)
                                    )
                                    ? ' even'
                                    : ' odd';
                            infoBlock.style.top = hGuides[i] + 'px';
                            infoBlock.style.left = vGuides[j] + 'px';
                            infoBlock.style.width = (vGuides[j + 1] - vGuides[j]) + 'px';
                            infoBlock.style.height = (hGuides[i + 1] - hGuides[i]) + 'px';
                            text = (vGuides[j + 1] - vGuides[j]) + ' x ' + (hGuides[i + 1] - hGuides[i]);
                            infoData1.nodeValue = text;
                            text = hGuides[i] + ' : ' + vGuides[j];
                            infoData2.nodeValue = text;
                            infoBlockTxt.appendChild(infoData1);
                            infoBlockTxt.appendChild(br);
                            infoBlockTxt.appendChild(infoData2);
                            infoBlock.appendChild(infoBlockTxt);
                            infoBlockTxt.style.marginTop = (i === 0) ? '31px' : '0';
                            infoBlockTxt.style.marginLeft = (j === 0) ? '42px' : '0';
                            infoFrag.appendChild(infoBlock);
                        }
                    }

                    infoBlockWrapper.appendChild(infoFrag);
                    if (detailsStatus === 1) {
                        wrapper.replaceChild(infoBlockWrapper, gInfoBlockWrapper);
                        gInfoBlockWrapper = infoBlockWrapper;
                    } else {
                        gInfoBlockWrapper.style.display = 'none';
                    }
                },
                calculateDomDimensions = function () {
                    var x = [],
                            y = [],
                            dm = [],
                            i = 0,
                            len = domElements.length,
                            findDimensions = function (elem) {
                                var t = 0,
                                        l = 0,
                                        w = elem.offsetWidth,
                                        h = elem.offsetHeight;
                                while (elem) {
                                    l += (elem.offsetLeft - elem.scrollLeft + elem.clientLeft);
                                    t += (elem.offsetTop - elem.scrollTop + elem.clientTop);
                                    elem = elem.offsetParent;
                                }

                                return [l, t, l + w, t + h];
                            },
                            getUnique = function (arr) {
                                var u = {}, a = [], idx = 0, arrLen = arr.length;
                                for (idx; idx < arrLen; idx = idx + 1) {
                                    if (u.hasOwnProperty(arr[idx]) === false) {
                                        a.push(arr[idx]);
                                        u[arr[idx]] = 1;
                                    }
                                }

                                return a;
                            };
                    for (i; i < len; i = i + 1) {
                        dm = findDimensions(domElements[i]);
                        x.push(dm[0]);
                        x.push(dm[2]);
                        y.push(dm[1]);
                        y.push(dm[3]);
                    }

                    x = getUnique(x).sort(function (a, b) {
                        return a - b;
                    });
                    y = getUnique(y).sort(function (a, b) {
                        return a - b;
                    });
                    return [x, y];
                },
                Menu = function () {
                    var menuList = null,
                            status = 0,
                            toggles = {},
                            menuItemsList = [{
                                    'text': 'Hide rulers',
                                    'hotkey': 'Ctrl + Alt + R',
                                    'alias': 'rulers'
                                }, {
                                    'text': 'Hide guides',
                                    'hotkey': 'Ctrl + Alt + G',
                                    'alias': 'guides'
                                }, {
                                    'text': 'Hide all',
                                    'hotkey': 'Ctrl + Alt + A',
                                    'alias': 'all'
                                }, {
                                    'text': 'Unlock rulers',
                                    'hotkey': 'Ctrl + Alt + L',
                                    'alias': 'lock'
                                }, {
                                    'text': 'Clear all guides',
                                    'hotkey': 'Ctrl + Alt + D',
                                    'alias': 'clear'
                                }, {
                                    'text': 'Open grid',
                                    'hotkey': 'Ctrl + Alt + O',
                                    'alias': 'open'
                                }, {
                                    'text': 'Save grid',
                                    'hotkey': 'Ctrl + Alt + G',
                                    'alias': 'save'
                                }, {
                                    'text': 'Snap to',
                                    'hotkey': 'Ctrl + Alt + C',
                                    'alias': 'snap'
                                }, {
                                    'text': 'Show detailed info',
                                    'hotkey': 'Ctrl + Alt + I',
                                    'alias': 'details'
                                }, {
                                    'text': 'Snap to DOM',
                                    'hotkey': 'Ctrl + Alt + E',
                                    'alias': 'snapdom'
                                }],
                            i = 0;
                    this.render = function () {
                        menuBtn = doc.createElement('div');
                        menuBtn.className = 'menu-btn unselectable';
                        menuBtn.appendChild(doc.createTextNode('\u250C'));
                        menuList = doc.createElement('ul');
                        menuList.className = 'rg-menu';
                        var menuItems = doc.createDocumentFragment(),
                                li = doc.createElement('li'),
                                liLink = doc.createElement('a'),
                                liDesc = doc.createElement('span'),
                                liHotKey = liDesc.cloneNode(false),
                                liDescTxt = doc.createTextNode(''),
                                liHotKeyTxt = liDescTxt.cloneNode(false);
                        liLink.href = 'javascript:';
                        liDesc.className = 'desc';
                        liHotKey.className = 'hotkey';
                        for (i; i < menuItemsList.length; i = i + 1) {
                            li = li.cloneNode(false);
                            liLink = liLink.cloneNode(false);
                            liDesc = liDesc.cloneNode(false);
                            liHotKey = liHotKey.cloneNode(false);
                            liDescTxt = liDescTxt.cloneNode(false);
                            liHotKeyTxt = liHotKeyTxt.cloneNode(false);
                            liDescTxt.nodeValue = menuItemsList[i].text;
                            liHotKeyTxt.nodeValue = menuItemsList[i].hotkey;
                            liDesc.appendChild(liDescTxt);
                            liHotKey.appendChild(liHotKeyTxt);
                            liLink.appendChild(liDesc);
                            liLink.appendChild(liHotKey);
                            li.appendChild(liLink);
                            menuItems.appendChild(li);
                            toggles[menuItemsList[i].alias] = {
                                obj: liLink,
                                txt: liDescTxt
                            };
                        }

                        evt.attach('mousedown', toggles.rulers.obj, function () {
                            toggleRulers();
                        });
                        evt.attach('mousedown', toggles.guides.obj, function () {
                            toggleGuides();
                        });
                        evt.attach('mousedown', toggles.all.obj, function () {
                            if (rulerStatus === 1 || guideStatus === 1) {
                                rulerStatus = guideStatus = 1;
                                wrapper.style.display = 'none';
                            } else {
                                rulerStatus = guideStatus = 0;
                                wrapper.style.display = 'block';
                            }

                            toggleRulers();
                            toggleGuides();
                        });
                        evt.attach('mousedown', toggles.lock.obj, function () {
                            toggleRulersLock();
                        });
                        evt.attach('mousedown', toggles.clear.obj, function () {
                            deleteGuides();
                        });
                        evt.attach('mousedown', toggles.open.obj, function () {
                            openGridDialog.open();
                        });
                        evt.attach('mousedown', toggles.save.obj, function () {
                            saveGrid();
                        });
                        evt.attach('mousedown', toggles.snap.obj, function () {
                            snapDialog.open();
                        });
                        evt.attach('mousedown', toggles.details.obj, function () {
                            detailsStatus = 1 - detailsStatus;
                            showDetailedInfo();
                        });
                        evt.attach('mousedown', toggles.snapdom.obj, function () {
                            snapDom = 1 - snapDom;
                            if (snapDom === 1) {
                                domDimensions = calculateDomDimensions();
                            }
                        });
                        menuList.appendChild(menuItems);
                        body.appendChild(menuBtn);
                        body.appendChild(menuList);
                        evt.attach('mousedown', menuBtn, function () {
                            toggles.rulers.txt.nodeValue = (rulerStatus === 1)
                                    ? 'Hide rulers'
                                    : 'Show rulers';
                            if (guidesCnt > 0) {
                                toggles.guides.obj.className = '';
                                toggles.clear.obj.className = '';
                                toggles.save.obj.className = '';
                                toggles.guides.txt.nodeValue = (guideStatus === 1)
                                        ? 'Hide guides'
                                        : 'Show guides';
                            } else {
                                toggles.guides.obj.className = 'disabled';
                                toggles.clear.obj.className = 'disabled';
                                toggles.save.obj.className = 'disabled';
                            }

                            toggles.all.txt.nodeValue = (rulerStatus === 1 || guideStatus === 1)
                                    ? 'Hide all'
                                    : 'Show all';
                            toggles.lock.txt.nodeValue = (locked === 0) ? 'Lock rulers' : 'Unlock rulers';
                            toggles.details.txt.nodeValue = (detailsStatus === 0) ? 'Show detailed info' : 'Hide detailed info';
                            toggles.snapdom.txt.nodeValue = (snapDom === 0) ? 'Snap to DOM' : 'Turn off snap to DOM';
                            toggles.open.obj.className = (gridListLen > 0) ? '' : 'disabled';
                            menuList.style.display = (status === 0) ? 'inline-block' : 'none';
                            status = 1 - status;
                        });
                    };
                    this.render();
                    this.close = function () {
                        if (menuList !== null) {
                            menuList.style.display = 'none';
                            status = 0;
                        }
                    };
                },
                SnapDialog = function () {
                    var dialog = null,
                            xInput = null,
                            yInput = null,
                            self = this;
                    this.render = function () {
                        if (dialog === null) {
                            dialog = doc.createElement('div');
                            xInput = doc.createElement('input');
                            yInput = xInput.cloneNode(false);
                            var text = doc.createTextNode(''),
                                    okBtn = doc.createElement('button'),
                                    xLabel = doc.createElement('label'),
                                    titleBar = dialog.cloneNode(false),
                                    dialogWrapper = dialog.cloneNode(false),
                                    inputWrapper = dialog.cloneNode(false),
                                    btnWrapper = dialog.cloneNode(false),
                                    resetBtn = okBtn.cloneNode(false),
                                    cancelBtn = okBtn.cloneNode(false),
                                    yLabel = xLabel.cloneNode(false),
                                    titleBarTxt = text.cloneNode(false),
                                    xLabelTxt = text.cloneNode(false),
                                    yLabelTxt = text.cloneNode(false),
                                    okBtnTxt = text.cloneNode(false),
                                    resetBtnTxt = text.cloneNode(false),
                                    cancelBtnTxt = text.cloneNode(false);
                            titleBarTxt.nodeValue = 'Snap guides to';
                            xLabelTxt.nodeValue = 'X';
                            yLabelTxt.nodeValue = 'Y';
                            okBtnTxt.nodeValue = 'OK';
                            resetBtnTxt.nodeValue = 'Reset';
                            cancelBtnTxt.nodeValue = 'Cancel';
                            dialog.className = 'dialog snap-dialog';
                            titleBar.className = 'title-bar';
                            dialogWrapper.className = 'wrapper';
                            xLabel.className = 'rg-x-label';
                            xLabel.setAttribute('for', 'rg-x-snap');
                            yLabel.className = 'rg-y-label';
                            yLabel.setAttribute('for', 'rg-y-snap');
                            xInput.setAttribute('type', 'number');
                            xInput.value = '100';
                            xInput.id = 'rg-x-snap';
                            xInput.setAttribute('type', 'number');
                            yInput.value = '100';
                            yInput.id = 'rg-y-snap';
                            okBtn.className = 'ok-btn';
                            resetBtn.className = 'reset-btn';
                            cancelBtn.className = 'cancel-btn';
                            titleBar.appendChild(titleBarTxt);
                            xLabel.appendChild(xLabelTxt);
                            yLabel.appendChild(yLabelTxt);
                            okBtn.appendChild(okBtnTxt);
                            resetBtn.appendChild(resetBtnTxt);
                            cancelBtn.appendChild(cancelBtnTxt);
                            inputWrapper.appendChild(xLabel);
                            inputWrapper.appendChild(xInput);
                            inputWrapper.appendChild(yLabel);
                            inputWrapper.appendChild(yInput);
                            inputWrapper.appendChild(resetBtn);
                            btnWrapper.appendChild(okBtn);
                            btnWrapper.appendChild(cancelBtn);
                            dialogWrapper.appendChild(inputWrapper);
                            dialogWrapper.appendChild(btnWrapper);
                            dialog.appendChild(titleBar);
                            dialog.appendChild(dialogWrapper);
                            body.appendChild(dialog);
                            evt.attach('mousedown', okBtn, function () {
                                xSnap = parseInt(xInput.value, 10);
                                ySnap = parseInt(yInput.value, 10);
                                self.close();
                            });
                            evt.attach('mousedown', resetBtn, function () {
                                xSnap = 0;
                                ySnap = 0;
                                self.close();
                            });
                            evt.attach('mousedown', cancelBtn, function () {
                                self.close();
                            });
                        }
                    };
                    this.render();
                    this.open = function () {
                        closeAllDialogs();
                        dialog.style.display = 'block';
                        dialog.style.left = ((doc.clientWidth - dialog.clientWidth) / 2) + 'px';
                        dialog.style.top = ((doc.clientHeight - dialog.clientHeight) / 2) + 'px';
                    };
                    this.close = function () {
                        dialog.style.display = 'none';
                    };
                },
                prepare = function () {
                    var style = doc.createElement('style'),
                            size = getWindowSize(),
                            elements = doc.getElementsByTagName('*'),
                            len = elements.length,
                            i = 0;
                    for (i; i < len; i = i + 1) {
                        domElements.push(elements[i]);
                    }

                    style.setAttribute('type', 'text/css');
                    if (style.styleSheet) {
                        style.styleSheet.cssText = cssText;
                    } else {
                        style.appendChild(doc.createTextNode(cssText));
                    }

                    body.appendChild(style);
                    setTimeout(function () {
                        hRuler = new Ruler('h', 3000);
                        vRuler = new Ruler('v', 7000);
                        wrapper = doc.createElement('div');
                        gInfoBlockWrapper = wrapper.cloneNode(false);
                        wrapper.className = 'rg-overlay';
                        gInfoBlockWrapper.className = 'info-block-wrapper';
                        wrapper.style.width = (size[0]) + 'px';
                        wrapper.style.height = (size[1]) + 'px';
                        wrapper.appendChild(hRuler);
                        wrapper.appendChild(vRuler);
                        wrapper.appendChild(gInfoBlockWrapper);
                        body.appendChild(wrapper);
                        domDimensions = calculateDomDimensions();
                        menu = new Menu();
                        snapDialog = new SnapDialog();
                        openGridDialog = new OpenGridDialog();
                        dialogs = [snapDialog, openGridDialog];
                    }, 10);
                };
        prepare();
        this.status = 1;
        this.disable = function () {
            if (vRuler !== null) {
                deleteGuides();
                vRuler.style.display = 'none';
                hRuler.style.display = 'none';
                wrapper.style.display = 'none';
                menuBtn.style.display = 'none';
            }

            rulerStatus = 0;
            this.status = 0;
        };
        this.enable = function () {
            if (vRuler !== null) {
                vRuler.style.display = 'block';
                hRuler.style.display = 'block';
                wrapper.style.display = 'block';
                menuBtn.style.display = 'block';
            }

            rulerStatus = 1;
            this.status = 1;
        };
        evt.attach('mousedown', document, function (e, src) {
            var x = e.clientX,
                    y = e.clientY,
                    guide = null,
                    guideInfo = null,
                    guideInfoText = null,
                    scrollPos = getScrollPos(),
                    snap = 0;
            if (src.className.indexOf('menu-btn') === -1) {
                menu.close();
            }

            if (vBound === 0) {
                vBound = vRuler.offsetWidth;
                hBound = hRuler.offsetHeight;
            }

            if (
                    (
                            (x > vBound && y < hBound) ||
                            (y > hBound && x < vBound)
                            ) && rulerStatus === 1
                    ) {
                guide = doc.createElement('div');
                guideInfo = guide.cloneNode(false);
                guideInfoText = doc.createTextNode('');
                gUid = 'guide-' + guidesCnt;
                guideInfo.className = 'info';
                guideInfo.appendChild(guideInfoText);
                guide.appendChild(guideInfo);
                if (x > vBound && y < hBound) {
                    guide.className = 'guide h draggable';
                    guide.style.top = (e.clientY + scrollPos[0]) + 'px';
                    guideInfo.style.left = (x + scrollPos[1] + 10) + 'px';
                    guide.type = 'h';
                    snap = ySnap;
                    mode = 2;
                } else if (y > hBound && x < vBound) {
                    guide.className = 'guide v draggable';
                    guide.style.left = (x + scrollPos[1]) + 'px';
                    guideInfo.style.top = ((y + scrollPos[0]) - 35) + 'px';
                    guide.type = 'v';
                    snap = xSnap;
                    mode = 1;
                }

                guide.id = gUid;
                guide.info = guideInfo;
                guide.text = guideInfoText;
                guide.x = 0;
                guide.y = 0;
                guides[gUid] = guide;
                wrapper.appendChild(guide);
                dragdrop.set(guide, {
                    mode: mode,
                    onstart: function (elem) {
                        var text = (elem.mode === 1)
                                ? parseInt(elem.style.left, 10) + 2
                                : parseInt(elem.style.top, 10) + 2;
                        elem.text.nodeValue = text + 'px';
                        if (elem.over !== undefined) {
                            evt.detach('mouseover', elem, elem.over);
                            evt.detach('mouseout', elem, elem.out);
                        }
                    },
                    onmove: function (elem) {
                        var text = '',
                                pos = 0,
                                dims = [],
                                len = 0,
                                i = 0;
                        pos = (elem.mode === 1) ? elem.style.left : elem.style.top;
                        pos = parseInt(pos, 10);
                        if (snapDom === 1) {
                            dims = domDimensions[elem.mode - 1];
                            for (i, len = dims.length; i < len; i = i + 1) {
                                if (pos <= dims[i]) {
                                    pos = dims[i];
                                    break;
                                }
                            }
                        }

                        text = pos + 'px';
                        if (elem.mode === 1) {
                            elem.style.left = (pos - 2) + 'px';
                            elem.x = pos;
                        } else {
                            elem.style.top = (pos - 2) + 'px';
                            elem.y = pos;
                        }

                        elem.text.nodeValue = text;
                    },
                    onstop: function (elem) {
                        elem.over = evt.attach('mouseover', elem, function (e, src) {
                            if (src.className === 'guide v draggable') {
                                elem.info.style.top = ((e.clientY + scrollPos[0]) - 35) + 'px';
                            } else if (src.className === 'guide h draggable') {
                                elem.info.style.left = (e.clientX + scrollPos[1] + 10) + 'px';
                            }

                            elem.info.style.display = 'block';
                        });
                        elem.out = evt.attach('mouseout', elem, function () {
                            elem.info.style.display = 'none';
                        });
                    },
                    snap: snap
                });
                dragdrop.start(e, guide);
                guidesCnt = guidesCnt + 1;
            }
        });
        evt.attach('mouseup', document, function (e, src) {
            removeInboundGuide(src, src.id);
            if (detailsStatus === 1) {
                showDetailedInfo();
            }
        });
        evt.attach('keyup', document, function (e) {
            if (e.ctrlKey === true && e.altKey === true) {
                switch (e.keyCode) {
                    case 83:
                        saveGrid();
                        break;
                    case 82:
                        toggleRulers();
                        break;
                    case 79:
                        openGridDialog.open();
                        break;
                    case 76:
                        toggleRulersLock();
                        break;
                    case 73:
                        detailsStatus = 1 - detailsStatus;
                        showDetailedInfo();
                        break;
                    case 71:
                        toggleGuides();
                        break;
                    case 69:
                        snapDom = 1 - snapDom;
                        if (snapDom === 1) {
                            domDimensions = calculateDomDimensions();
                        }
                        break;
                    case 68:
                        deleteGuides();
                        break;
                    case 67:
                        snapDialog.open();
                        break;
                    case 65:
                        if (rulerStatus === 1 || guideStatus === 1) {
                            rulerStatus = guideStatus = 1;
                            wrapper.style.display = 'none';
                        } else {
                            rulerStatus = guideStatus = 0;
                            wrapper.style.display = 'block';
                        }

                        toggleRulers();
                        toggleGuides();
                        break;
                }
            }
        });
        evt.attach('resize', window, function () {
            var size = getWindowSize();
            wrapper.style.width = size[0] + 'px';
            wrapper.style.height = size[1] + 'px';
            if (resizeTimer !== null) {
                window.clearTimeout(resizeTimer);
            }

            if (snapDom === 1) {
                resizeTimer = window.setTimeout(function () {
                    domDimensions = calculateDomDimensions();
                }, 100);
            }
        });
    };
    $.fn.jqRulerGuides.defaults =
            {
                doc: document.documentElement,
                body: document.body,
                locked: 1,
                dialogs: [],
                snapDialog: null,
                openGridDialog: null,
                xSnap: 0,
                ySnap: 0,
                mode: 2,
                guides: {},
                guidesCnt: 0,
                gUid: '',
                rulerStatus: 1,
                guideStatus: 1,
                hBound: 0,
                vBound: 0,
                gridListLen: 0,
                detailsStatus: 0,
                domElements: [],
                domDimensions: [],
                snapDom: 0
            };
})
        (jQuery);