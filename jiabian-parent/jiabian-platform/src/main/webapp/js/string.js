

function parseStandard(str) {
    if (str.length == 1) {
        return "000" + str;
    } else if (str.length == 2) {
        return "00" + str;
    } else if (str.length == 3) {
        return "0" + str;
    } else {
        return str;
    }
}
function encode(s) {
    var t = '';
    for (var i = 0; i < s.length; i++) {
        t += '\\u' + parseStandard(s.charCodeAt(i).toString(16));
    }
    return t;
//	alert(t);
//	var t = eval('\'' + t.replace(/\\\\/g, '\\') + '\'');
//	alert(t);
//	return t;
}


function checktextarea(obj, fontobj, max) {
    var msgobj = document.getElementById(fontobj);
    if (obj.innerHTML.length > max) {
        obj.innerHTML = obj.innerHTML.substring(0, max);
    }
    msgobj.innerHTML = obj.innerHTML.length + "/" + max + "字";
}

// added by leejun at 2013/3/5 10:29
function getDMZ(url) {
    openwindow(url, 'selector', 800, 700);
}

//验证obj是否为空,不锁定
function isValidValue1(obj, str) {
    var suffix = "";
    if (obj.nodeName == "INPUT") {
        suffix = "请填写";
    } else {
        suffix = "请选择";
    }

    var s = JTrim(obj.value);
    if (s.length == 0) {
        if (str != "") {
            alert(suffix + "【" + str + "】！");
            obj.focus();
        }
        return false;
    }
    return true;
}

function UpdatebywybmList(gourl, type) {
    if (getSelectCount(form1.wybm) >= 1) {
        if (confirm("确定要删除吗？")) {
            form1.action = gourl;
            try {
                getWybms();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "updateState";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}


function hfList(gourl, type) {
    if (getSelectCount(form1.wybm) >= 1) {
        if (confirm("确定要恢复吗？")) {
            form1.hf.value = 1;
            form1.action = gourl;
            try {
                getWybms();
                form1.deltype.value = type;
            }
            catch (err) {


            }
            form1.doAction.value = "updateState";
            form1.submit();
        }

    }
    else {
        alert('请至少选择一条记录！');
    }
}


//提交删除增加列表判断
function DelByWybmList(gourl, type) {
    if (getSelectCount(form1.wybm) >= 1) {
        if (confirm("确定删除吗？")) {
            form1.action = gourl;
            try {
                getWybms();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "delete";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}
//逻辑删除增加列表判断
function DelByWybmList1(gourl, type) {
    if (getSelectCount(form1.wybm) >= 1) {
        if (confirm("确定删除吗？")) {
            form1.action = gourl;
            try {
                getWybms();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "deletelj";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}

//恢复列表判断
function DelByWybmList2(gourl, type) {
    if (getSelectCount(form1.wybm) >= 1) {
        if (confirm("确定要取消删除吗？")) {
            form1.action = gourl;
            try {
                getWybms();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "updatehf";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}
//提交批量操作fsteel
function DoByWybmList(gourl, method, str) {
    if (getSelectCount(form1.wybm) >= 1) {
        if (confirm(str)) {
            form1.action = gourl;
            try {
                getWybms();

            }
            catch (err) {

            }
            form1.doAction.value = method;
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}

//得到选择的字符串
function getWybms() {
    var ids = "";
    var obj = form1.wybm;
    if (form1.wybm.length == null) {
        if (form1.wybm.checked) {
            ids = form1.wybm.value;
        }
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {

            if (obj[tmp].checked) {
                ids += obj[tmp].value + ",";
            }
        }
        ids = ids.substring(0, ids.length - 1);
    }
    form1.checkids.value = ids;
}


//得到选择的字符串 无逗号
function getIdsWithout() {

    var ids = "";
    var obj = form1.id;
    if (form1.id.length == null) {
        if (form1.id.checked) {
            ids = form1.id.value;
        }
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {

            if (obj[tmp].checked) {
                ids += obj[tmp].value + ",";
            }
        }
        ids = ids.substring(0, ids.length - 1);
    }
    form1.checkids.value = ids;
}


//清空复选框
function qkcheckbox(obj) {
    if (obj.length == null) {
        return true;
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {
            obj[tmp].checked = false;
        }

    }
}
//得到复选框的值 fsteel
function getCheckBoxValues(obj, obj2) {//参数（复选框，存放结果的隐藏表单）

    var ids = "";
    if (obj.length == null) {
        if (obj.checked) {
            ids = obj.value;
        }
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {
            if (obj[tmp].checked) {
                ids += obj[tmp].value + ",";
            }
        }
    }
    if (ids.length > 0) {
        ids = ids.substr(0, ids.length - 1);
    }
    obj2.value = ids;
}

//回显checkedbox fsteel
function checkBoxHx(boxObj, backalue) {//参数（复选框，返回值（用，隔开）

    if (backValue = "") {
        return;
    }
    else {
        var values = backalue.split(',');
        for (var tmp = 0; tmp < boxObj.length; tmp++) {
            for (var j = 0; j < values.length; j++) {

                if (boxObj[tmp].value == values[j]) {
                    boxObj[tmp].checked = "checked";
                    break;
                }
            }

        }
    }
}


//随机数
function GetRandom() {
    var n = 1000;
    GetRandomn = Math.floor(Math.random() * n + 1);
    return GetRandomn;
}
function JTrim(s) {
    var r1, r2, s1, s2, s3;
    r1 = new RegExp("^ *");
    r2 = new RegExp(" *$");
    s1 = "" + s + "";
    s2 = s1.replace(r1, "");
    s3 = s2.replace(r2, "");
    r1 = null;
    r2 = null;
    return(s3);
}

//验证电子邮件的合法性
function isValidEmail(obj, str) {
    var s = JTrim(obj.value);
    var n = 0;
    var apos = s.indexOf("@");
    var dpos = s.lastIndexOf(".");
    var spos = s.indexOf(" ");
    var cpos = s.indexOf(",");
    if (cpos >= 0 || spos >= 0 || apos <= 0 || dpos <= 0) n = 0;
    else if (dpos <= apos + 1) n = 0;
    else if (s.charAt(apos + 1) == '.') n = 0;
    else if (s.charAt(s.length - 1) == '.') n = 0;
    else
        return true;
    if (str != "") {
        alert("无效的" + str + "！");
        obj.focus();
        obj.value = "";
    }
    return false;
}

function doclose2(url) {
    try {
        window.opener.focus();
        window.opener.document.location = url;
        //window.opener.location.reload();
    }
    catch (e) {
    }
    window.close();
}

//验证密码合法性
function isValidPassword(obj, str) {
    var s = obj.value;
    if (s.length == 0) {
        if (str != "") {
            alert(str + "不可为空！");
            obj.focus();
        }
        return false;
    }
    return true;
}

//判断数组是否存在重复值
function isarray(obj, str) {
    var len = obj.length;
    for (var i = 0; i < len - 1; i++) {
        for (var j = i + 1; j < len; j++) {
            if (obj[i].value == obj[j].value) {
                alert(str + "不可重复！");
                return false;
            }
        }
    }
    return true;
}


//验证身份证号码，日期获取
function CheckCard() {
    var idcard = form1.sfzhm.value;
    if (idcard.length > 0) {
        if (!checkIdcard(idcard)) {
            document.form1.csrq.value = "";
            document.form1.sfzhm.value = "";
            document.form1.sfzhm.focus();
        } else {
            //解析身份证号码
            if (idcard.length == 18) {
                var sub_idcard = idcard.substring(6, 14);
                //组合出生日期
                var csrq_ = sub_idcard.substring(0, 4) + "-" + sub_idcard.substring(4, 6) + "-" + sub_idcard.substring(6);
                document.form1.csrq.value = csrq_;
            } else if (idcard.length == 15) {
                var sub_idcard = idcard.substring(6, 12);
                //组合出生日期
                var csrq_ = "19" + sub_idcard.substring(0, 2) + "-" + sub_idcard.substring(2, 4) + "-" + sub_idcard.substring(4);
                document.form1.csrq.value = csrq_;
            }
        }
    }
}
//验证str是否为数字
function isDigits1(obj, str) {
    var s = obj.value;
    var c;
    for (tmp = 0; tmp < s.length; tmp++) {
        c = s.charAt(tmp);
        if (c > '9' || c < '0') {
            if (str != "") {
                alert(str + '必须是整数！');
                obj.focus();
            }
            return false;
        }
    }
    return true;
}

//验证str是否为数字
//added by leejun at 2013-2-22 15:00:00
function isDigits11(obj, str) {
    var s = obj.value;
    var c;
    for (tmp = 0; tmp < s.length; tmp++) {
        c = s.charAt(tmp);
        if (c > '9' || c < '0') {
            if (str != "") {
                alert(str + '必须是数字！');
                obj.focus();
            }
            return false;
        }
    }
    return true;
}


//验证str是否为数字
function isDigits3(obj) {
    var s = obj.value;
    //alert("s--"+s);
    var c;
    for (tmp = 0; tmp < s.length; tmp++) {
        c = s.charAt(tmp);
        if (c > "9" || c < "0") {
            alert('请填写整数！');
            obj.focus();
            return false;
        }
    }
    return true;
}
//判断分值
function isfenshu(obj, t) {
    var s = obj.value;
    //alert(t)
    if (s > t) {
        alert("此项扣分不得超过" + t + "分！");
        obj.focus();
        return false;
    }

    return true;
}


//判断总和
function iszonghe(obj1, obj2, obj3, t) {
    var z = parseInt(obj1.value);
    var g = parseInt(obj2.value);
    var s = parseInt(obj3.value);
    if (z != "" && g != "" && s != "") {
        if ((g + s) != z) {
            alert(t + "的工业产品组数与食品产品组数之和与总数不相等！");
            obj1.focus();
            //obj2.focus();
            //obj3.focus();
            return false;
        }
        return true;
    }

}


//判断检验组数大小
function isjydx(obj1, obj2) {
    var a = parseInt(obj1.value);
    var b = parseInt(obj2.value);
    if (b > a) {
        alert("检验组数不能超过任务量！");
        obj1.focus();
        obj2.focus();
        return false;
    }
    return true;
}


//验证邮编
function checkYzbm(obj, str) {
    var s = obj.value;
    var c;
    if (s.length != 6) {
        alert(str + '长度必须是6位！');
        obj.focus();
        obj.value = "";
        return false;
    }
    else {
        for (tmp = 0; tmp < s.length; tmp++) {
            c = s.charAt(tmp);
            if (c > '9' || c < '0') {
                if (str != "") {
                    alert(str + '必须是整数！');
                    obj.focus();
                    obj.value = "";
                }
                return false;
            }
        }
        return true;
    }
}

//验证身份证号码
function checkIdcard(idcard1) {
    var idcard = idcard1.value;

    var Errors = new Array("验证通过!", "身份证号码位数不对!", "身份证号码出生日期超出范围或含有非法字符!", "身份证号码校验错误!", "身份证地区非法!");
    var area = { 11: "北京", 12: "天津", 13: "河北", 14: "山西", 15: "内蒙古", 21: "辽宁", 22: "吉林", 23: "黑龙江", 31: "上海", 32: "江苏", 33: "浙江", 34: "安徽", 35: "福建", 36: "江西", 37: "山东", 41: "河南", 42: "湖北", 43: "湖南", 44: "广东", 45: "广西", 46: "海南", 50: "重庆", 51: "四川", 52: "贵州", 53: "云南", 54: "西藏", 61: "陕西", 62: "甘肃", 63: "青海", 64: "宁夏", 65: "新疆", 71: "台湾", 81: "香港", 82: "澳门", 91: "国外" }

    var idcard, Y, JYM;
    var S, M;
    var idcard_array = new Array();
    idcard_array = idcard.split("");
    /*地区检验*/
    if (area[parseInt(idcard.substr(0, 2))] == null) {
        alert(Errors[4]);
        idcard1.focus();
        idcard1.value = "";
        return false;
    }
    /*身份号码位数及格式检验*/
    switch (idcard.length) {
        case 15:
            if ((parseInt(idcard.substr(6, 2)) + 1900) % 4 == 0 || ((parseInt(idcard.substr(6, 2)) + 1900) % 100 == 0 && (parseInt(idcard.substr(6, 2)) + 1900) % 4 == 0)) {
                ereg = /^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}$/; //测试出生日期的合法性
            } else {
                ereg = /^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}$/; //测试出生日期的合法性
            }
            if (ereg.test(idcard)) {
                return true;
            }
            else {
                alert(Errors[2]);
                idcard1.focus();
                idcard1.value = "";
                return false;
            }
            break;

        case 18:
            if (parseInt(idcard.substr(6, 4)) % 4 == 0 || (parseInt(idcard.substr(6, 4)) % 100 == 0 && parseInt(idcard.substr(6, 4)) % 4 == 0)) {
                ereg = /^[1-9][0-9]{5}19[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}[0-9Xx]$/; //闰年出生日期的合法性正则表达式
            } else {
                ereg = /^[1-9][0-9]{5}19[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}[0-9Xx]$/; //平年出生日期的合法性正则表达式
            }
            if (ereg.test(idcard)) {//测试出生日期的合法性
                //计算校验位
                S = (parseInt(idcard_array[0]) + parseInt(idcard_array[10])) * 7
                    + (parseInt(idcard_array[1]) + parseInt(idcard_array[11])) * 9
                    + (parseInt(idcard_array[2]) + parseInt(idcard_array[12])) * 10
                    + (parseInt(idcard_array[3]) + parseInt(idcard_array[13])) * 5
                    + (parseInt(idcard_array[4]) + parseInt(idcard_array[14])) * 8
                    + (parseInt(idcard_array[5]) + parseInt(idcard_array[15])) * 4
                    + (parseInt(idcard_array[6]) + parseInt(idcard_array[16])) * 2
                    + parseInt(idcard_array[7]) * 1
                    + parseInt(idcard_array[8]) * 6
                    + parseInt(idcard_array[9]) * 3;
                Y = S % 11;
                M = "F";
                JYM = "10X98765432";
                M = JYM.substr(Y, 1);
                /*判断校验位*/
                if (M == idcard_array[17]) {
                    return true;
                    /*检测ID的校验位*/
                }
                else {
                    alert(Errors[3]);
                    idcard1.focus();
                    idcard1.value = "";
                    return false;
                }
            }
            else {
                alert(Errors[2]);
                idcard1.focus();
                idcard1.value = "";
                return false;
            }
            break;

        default:
            alert(Errors[1]);
            idcard1.focus();
            idcard1.value = "";
            return false;

    }
}


//验证法人身份证号码
function checkIdcard_frsfz(zjlx1, idcard1, charsmonitor_sfzh) {
    var zjlx = zjlx1.value;
    var idcard = idcard1.value;

    if (zjlx == "0") {
        var Errors = new Array("验证通过!", "身份证号码位数不对!", "身份证号码出生日期超出范围或含有非法字符!", "身份证号码校验错误!", "身份证地区非法!");
        var area = { 11: "北京", 12: "天津", 13: "河北", 14: "山西", 15: "内蒙古", 21: "辽宁", 22: "吉林", 23: "黑龙江", 31: "上海", 32: "江苏", 33: "浙江", 34: "安徽", 35: "福建", 36: "江西", 37: "山东", 41: "河南", 42: "湖北", 43: "湖南", 44: "广东", 45: "广西", 46: "海南", 50: "重庆", 51: "四川", 52: "贵州", 53: "云南", 54: "西藏", 61: "陕西", 62: "甘肃", 63: "青海", 64: "宁夏", 65: "新疆", 71: "台湾", 81: "香港", 82: "澳门", 91: "国外" }

        var idcard, Y, JYM;
        var S, M;
        var idcard_array = new Array();
        idcard_array = idcard.split("");
        /*地区检验*/
        if (area[parseInt(idcard.substr(0, 2))] == null) {
            alert(Errors[4]);
            idcard1.focus();
            idcard1.value = "";
            charsmonitor_sfzh.value = 0;
            return false;
        }
        /*身份号码位数及格式检验*/
        switch (idcard.length) {
            case 15:
                if ((parseInt(idcard.substr(6, 2)) + 1900) % 4 == 0 || ((parseInt(idcard.substr(6, 2)) + 1900) % 100 == 0 && (parseInt(idcard.substr(6, 2)) + 1900) % 4 == 0)) {
                    ereg = /^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}$/; //测试出生日期的合法性
                } else {
                    ereg = /^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}$/; //测试出生日期的合法性
                }
                if (ereg.test(idcard)) {
                    return true;
                }
                else {
                    alert(Errors[2]);
                    idcard1.focus();
                    idcard1.value = "";
                    charsmonitor_sfzh.value = 0;
                    return false;
                }
                break;

            case 18:
                //18位身份号码检测
                //出生日期的合法性检查
                //闰年月日:((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))
                //平年月日:((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))
                if (parseInt(idcard.substr(6, 4)) % 4 == 0 || (parseInt(idcard.substr(6, 4)) % 100 == 0 && parseInt(idcard.substr(6, 4)) % 4 == 0)) {
                    ereg = /^[1-9][0-9]{5}19[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}[0-9Xx]$/; //闰年出生日期的合法性正则表达式
                } else {
                    ereg = /^[1-9][0-9]{5}19[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}[0-9Xx]$/; //平年出生日期的合法性正则表达式
                }
                if (ereg.test(idcard)) {//测试出生日期的合法性
                    //计算校验位
                    S = (parseInt(idcard_array[0]) + parseInt(idcard_array[10])) * 7
                        + (parseInt(idcard_array[1]) + parseInt(idcard_array[11])) * 9
                        + (parseInt(idcard_array[2]) + parseInt(idcard_array[12])) * 10
                        + (parseInt(idcard_array[3]) + parseInt(idcard_array[13])) * 5
                        + (parseInt(idcard_array[4]) + parseInt(idcard_array[14])) * 8
                        + (parseInt(idcard_array[5]) + parseInt(idcard_array[15])) * 4
                        + (parseInt(idcard_array[6]) + parseInt(idcard_array[16])) * 2
                        + parseInt(idcard_array[7]) * 1
                        + parseInt(idcard_array[8]) * 6
                        + parseInt(idcard_array[9]) * 3;
                    Y = S % 11;
                    M = "F";
                    JYM = "10X98765432";
                    M = JYM.substr(Y, 1);
                    /*判断校验位*/
                    if (M == idcard_array[17]) {
                        return true;
                        /*检测ID的校验位*/
                    }
                    else {
                        alert(Errors[3]);
                        idcard1.focus();
                        idcard1.value = "";
                        charsmonitor_sfzh.value = 0;
                        return false;
                    }
                }
                else {
                    alert(Errors[2]);
                    idcard1.focus();
                    idcard1.value = "";
                    charsmonitor_sfzh.value = 0;
                    return false;
                }
                break;

            default:
                alert(Errors[1]);
                idcard1.focus();
                idcard1.value = "";
                charsmonitor_sfzh.value = 0;
                return false;

        }

    }
    else {
        if (idcard != "") {
            if (idcard.length <= 4) {
                alert("证件号码长度不能小于4位！");
                idcard1.focus();
                idcard1.value = "";
                charsmonitor_sfzh.value = 0;
                return false;
            }
            else {
                return true;
            }
        }
        else {
            alert("证件号码不能为空！");
            idcard1.focus();
            return false;
        }
    }
}


//验证密码是否相同
function isMatchPassword(obj1, obj2, str) {
    var s1 = obj1.value;
    var s2 = obj2.value;
    if (s1 != s2) {
        alert(str + "不匹配！");
        obj1.focus();
        return false;
    }
    return true;
}

//验证输入框长度
function isinputlength(obj, str) {
    var s = obj.value;
    if (s.length != 9) {
        if (str != "") {
            alert(str + "必须为9位！");
            obj.focus();
        }
        return false;
    }
    return true;
}

//验证obj是否为空
function isValidValue_bg(obj, str) {
    var s = JTrim(obj.value);
    if (s.length == 0) {
        if (str != "") {
            alert(str + "不可为空！");
            obj.focus();
        }
        return false;
    }
    return true;
}


//验证obj是否为空
function isValidValue(obj, str) {
    var suffix = "";
    if (obj.nodeName == "INPUT") {
        suffix = "请填写";
    } else {
        suffix = "请选择";
    }

    var s = JTrim(obj.value);
    if (s.length == 0) {
        if (str != "") {
            alert(suffix + "【" + str + "】！");
            obj.focus();
        }
        return false;
    }
    return true;
}

//验证obj是否为空
function isValidValueNofocus(obj, str) {
    var suffix = "";
    if (obj.nodeName == "INPUT") {
        suffix = "请填写";
    } else {
        suffix = "请选择";
    }

    var s = JTrim(obj.value);
    if (s.length == 0) {
        if (str != "") {
            alert(suffix + "【" + str + "】！");
        }
        return false;
    }
    return true;
}

//验证obj 如果obj为空不做验证，不为空则执行相应的验证。
//type 需要验证的类型 1 验证是否为电话 isValidTel 2 邮箱 isValidEmail 3 邮编 checkYzbm
//type 可添加
function fkyzwithtype(obj, type, str) {

    var s = JTrim(obj.value);

    if (s.length != 0) {
        if (type == "1") {
            return (isValidTel(obj, str));
        }
        else if (type == "2") {
            return (isValidEmail(obj, str));
        }
        else if (type == "3") {
            return (checkYzbm(obj, str));

        }
    }
    return true;
}

//验证obj是否为#
function isValidValue_jglx(obj, str) {
    var s = JTrim(obj.value);
    if (s == "#") {
        if (str != "") {
            alert(str + "不可为空！");
            obj.focus();
        }
        return false;
    }
    return true;
}

//验证obj是否包含特殊字符
function isCheckTszf(obj, str) {
    var pattern = /.*["@#$%^&',"<>]{1,}.*/;
    if ((solecism = pattern.exec(obj.value)) != null) {
        if (str != "") {
            alert(str + "不能包含特殊字符!");
            obj.focus();
            obj.value = "";
        }
        return false;
    }
    return true;
}


//验证注册日期与申报日期的大小
function isCheckDateValue(obj1, obj2, str1, str2) {
    var s1 = obj1.value;
    var s2 = obj2.value;
    if (s1 > s2) {
        alert(str1 + "不能大于" + str2);
        obj1.focus();
        return false;
    }
    return true;
}


//验证str是否包含/
function noSlash(obj, str) {
    var s = obj.value;
    var c;
    for (tmp = 0; tmp < s.length; tmp++) {
        c = s.charAt(tmp);
        if (c == '/') {
            if (str != "") {
                alert(str + '不可包含字符"/"！');
                obj.focus();
            }
            return false;
        }
    }
    return true;
}
//验证obj是否包含str/
function noStr(obj, str) {
    var s = obj.value;
    var c;
    for (tmp = 0; tmp < s.length; tmp++) {
        c = s.charAt(tmp);
        if (c == str) {
            if (str != "") {
                alert('不可包含字符"' + str + '"！');
                obj.focus();
            }
            return false;
        }
    }
    return true;
}

//验证obj是否包含中文/
function nochinaStr(obj, str) {
    var s = obj.value;
    var c;
    var re = /[^\x00-\xff]/g;
    for (tmp = 0; tmp < s.length; tmp++) {
        c = s.charAt(tmp);
        if (re.test(c)) {
            alert(str + '不可包含中文字符!');
            obj.focus();
            return false;
        }

    }
    return true;
}
//验证中文字符
function chinaStr(obj, str) {
    var s = obj.value;
    var c;
    var re = /[^\u4E00-\u9FA5]/g;
    for (tmp = 0; tmp < s.length; tmp++) {
        c = s.charAt(tmp);
        if (re.test(c)) {
            alert(str + '必须为中文字符!');
            obj.focus();
            return false;
        }

    }
    return true;
}

function strtoFloat(str) {
    var ret = 0.0;
    try {
        ret = parseFloat(str);
        if (isNaN(ret)) {
            ret = 0;
        }
    }
    catch (e) {
        ret = 0;
    }

    return ret;
}

function strtoInt(str) {
    var ret = 0;
    try {
        ret = parseInt(str)
    }
    catch (e) {
        ret = 0;
    }
    return ret;
}

//验证str是否为数字
function isDigits(obj, str) {
    var s = obj.value;
    var c;
    for (tmp = 0; tmp < s.length; tmp++) {
        c = s.charAt(tmp);
        if (tmp == 0 && c == '0') {
            alert(str + '不规范！');
            obj.focus();
            obj.value = "";
            return false;
        }
        else {
            if (c > '9' || c < '0') {
                if (str != "") {
                    alert(str + '必须是整数！');
                    obj.focus();
                    obj.value = "";
                }
                return false;
            }
        }
    }
    return true;
}

//验证str是否为数字
function isDigits2(obj, str) {
    var s = obj.value;
    var c;
    if (s.indexOf("-") == 0) {
        s = s.substr(1);
    }
    for (tmp = 0; tmp < s.length; tmp++) {
        c = s.charAt(tmp);
        if (c > '9' || c < '0') {
            if (str != "") {
                alert(str + '必须是整数！');
                obj.focus();
            }
            return false;
        }
    }
    return true;
}


//验证str格式是否(12.0)
function isNumber_sz(digits_sz) {
    var Letters = "1234567890."; //可以自己增加可输入值
    var i, c;
    if (digits_sz.charAt(0) == '.') {
        return false;
    }
    for (i = 0; i < digits_sz.length; i++) {
        c = digits_sz.charAt(i);
        if (Letters.indexOf(c) < 0) {
            return false;
        }
    }
    return true;
}

function isDigits_sz(obj, str) {
    var strValue = obj.value;
    if (isNumber_sz(strValue)) {
        if (strValue > 10000) {
            if (confirm('请确认注册资金大于一亿?')) {
                return true;
            }
            else {
                obj.focus();
                obj.value = "";
                return false;
            }
        }
        else {
            return true;
        }
    }
    else {

        alert("请输入有效的" + str);
        obj.focus();
        obj.value = "";
        return false;

    }
}

//验证str是否为 Double型
function isDouble(obj, str) {
    var s = obj.value;
    var c;
    if (str != null && str != "")
        for (tmp = 0; tmp < s.length; tmp++) {
            c = s.charAt(tmp);
            if (c > '9' || c < '0') {
                if (tmp > 0 && c == ".") {
                }
                else if (str != "") {
                    alert(str + '必须是数字！');
                    obj.focus();
                    return false;
                }

            }
        }
    return true;
}

//验证str是否为 Double型
function isSaveStr(obj, str) {
    var s = obj.value;
    var c;
    if (str != null && str != "") {
        for (tmp = 0; tmp < s.length; tmp++) {
            c = s.charAt(tmp);
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            }
            else {
                alert(str + '必须是数字或英文字母！');
                obj.focus();
                return false;
            }
        }
    }
    return true;
}

//提取STR中所有的数字
function parseDigits(str) {
    var c;
    var i = 0, j = 0;
    var sOK = "";

    for (; tmp < str.length; tmp++) {
        c = str.charAt(tmp);
        if (c > '9' || c < '0')
            continue;
        sOK += "" + c;
    }
    return sOK;
}

//验证年月日的合法性
function isValidDate(sYear, sMonth, sDate) {
    if (sMonth == 2) {
        if (sDate > 29)
            return false;
        else if (sDate == 29 && !( (sYear % 4) == 0 && (sYear % 100) != 0 || (sYear % 400) == 0 ))
            return false;
        else
            return true;
    }
    else if ((sMonth == 4 || sMonth == 6 || sMonth == 9 || sMonth == 11 ) && sDate == 31)
        return false;
    else
        return true;
}

//选中 obj中值为 selectedValue
function selected(obj, selectedValue) { //默认选择 ，obj为选择菜单 ，selectedValue为默认值
    if (selectedValue == "")
        return;
    for (var tmp = 0; tmp < obj.length; tmp++) {     //如果选择菜单某项的值等于selectedValue，则该项为默认选项
        var value = obj.options[tmp].value;
        if (value == "")
            value = obj.options[tmp].text;
        if (value == selectedValue) {
            obj.options[tmp].selected = true;
            return;
        }
    }
}

//删除 obj中值为 selectedValue
function removeSelect(obj, selectedValue) {
    if (selectedValue == "")
        return;
    for (var tmp = 0; tmp < obj.length; tmp++) {
        var value = obj.options[tmp].value;
        if (value == selectedValue) {
            obj.remove(tmp);
        }
    }
}

//选中单选框中值为 selectedValue
function checked(obj, selectedValue) { //默认选择 ，obj为选择菜单 ，selectedValue为默认值

    if (selectedValue == "")
        return;
    for (var tmp = 0; tmp < obj.length; tmp++) {     //如果选择菜单某项的值等于selectedValue，则该项为默认选项
        var value = obj[tmp].value;
        if (value == "")
            value = obj[tmp].text;
        if (value == selectedValue) {
            obj[tmp].checked = true;
            return;
        }
    }
}
//单选或复选表单非空
//name 表单name   str 提示信息
function radiocheck(name, str) {
    var arr = document.getElementsByName(name);
    var flag = false;
    if (arr.length != 0) {
        for (a = 0; a < arr.length; a++) {
            if (arr[a].checked == true) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            alert(str + "不能为空！");
        }
    }
    else {
        alert("不存在的表单项！");
    }
    return flag;
}


//增加行非空验证wrg
function fkzjh(name, str) {//name:需验证的表单name
    var objs = document.getElementsByName(name);
    var flag = true;
    for (var i = 0; i < objs.length; i++) {
        if (isValidValue(objs[i], str)) {
            flag = true;
        }
        else {
            flag = false;
            break;
        }
    }
    return flag;
}

//选中OBJ中所有的先项
function selectAll(checkobj, obj) {
    if (checkobj.checked) {
        if (typeof(obj) != "undefined" && obj.length == null) {
            if (obj.disabled) {
                obj.checked = false;
            }
            else {
                obj.checked = true;
            }
        }
        else if (typeof(obj) != "undefined") {
            for (tmp = 0; tmp < obj.length; tmp++) {
                if (typeof(obj[tmp]) != "undefined") {
                    if (obj[tmp].disabled) {
                        obj[tmp].checked = false;
                    }
                    else {
                        obj[tmp].checked = true;
                    }
                }
            }

        }
    }
    else {
        if (typeof(obj) != "undefined" && obj.length == null) {
            obj.checked = false;
        }
        else if (typeof(obj) != "undefined") {
            for (tmp = 0; tmp < obj.length; tmp++) {
                if (typeof(obj[tmp]) != "undefined")
                    obj[tmp].checked = false;
            }

        }
    }
}


//全选
function selectall(obj) {
    if (obj.length == null) {
        obj.checked = true;
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {
            obj[tmp].checked = true;
        }
    }
}
//反选
function notselect(obj) {

    if (obj.length == null) {
        if (obj.checked) {
            obj.checked = false;
        } else {
            obj.checked = true;
        }
    }
    else {
        for (tmp = 0; tmp < obj.length; tmp++) {
            if (obj[tmp].checked) {
                obj[tmp].checked = false;
            } else {
                obj[tmp].checked = true;

            }

        }

    }

}

//获取单先框或多选择框选中的数目,i 不带空格
function setSelectno(selObj, values) {
    if (selObj.length == null) {
        if (values.indexOf("," + selObj.value + ",") != -1) {
            selObj.checked = true
        }
        return;
    }
    else {
        if (values.length == 0) {
            return;
        }
        else {
            for (tmp = 0; tmp < selObj.length; tmp++) {

                if (values.indexOf("," + selObj[tmp].value + ",") != -1) {
                    selObj[tmp].checked = true
                }
            }
        }
    }
    return;
}

//获取单先框或多选择框选中的数目
function setSelect(selObj, values) {
    if (selObj.length == null) {
        if (values.indexOf(", " + selObj.value + ", ") != -1) {
            selObj.checked = true
        }
        return;
    }
    else {
        if (values.length == 0) {
            return;
        }
        else {
            for (tmp = 0; tmp < selObj.length; tmp++) {

                if (values.indexOf(", " + selObj[tmp].value + ", ") != -1) {
                    selObj[tmp].checked = true
                }
            }
        }
    }
    return;
}

//获取单先框或多选择框选中的数目
function getSelectCount(selObj) {

    var count = 0;
    if (selObj == null) {
        return count;
    }
    if (selObj.length == null) {
        if (selObj.checked == true)
            count = 1;
    }
    else {
        for (tmp = 0; tmp < selObj.length; tmp++) {
            if (typeof(selObj[tmp]) != "undefined" && selObj[tmp].checked == true)
                count++;
        }
    }
    return count;
}

//获取第一个选择项的值
function getfirstSelect(selObj) {
    var value = '';
    if (selObj.length == null) {
        if (selObj.checked == true) value = selObj.value;
    }
    else {
        for (tmp = 0; tmp < selObj.length; tmp++) {
            if (selObj[tmp].checked == true) {
                value = selObj[tmp].value
                break;
            }
        }
    }
    return value;
}

//转到指定页面
function itemGo(gourl) {
    window.location = gourl;
}

//转到自定义页面，并定义其动作。
function itemToAction(gourl, action) {
    form1.action = gourl;
    form1.doAction.value = action;
    form1.submit();
}

//转到新增页面
function itemToAdd(gourl) {
    form1.action = gourl;
    form1.doAction.value = "toadd";
    form1.submit();
}

//转到修改页面增加列表判断
function itemToAddList(gourl) {
    if (getSelectCount(form1.id) >= 1) {
        form1.action = gourl;
        form1.doAction.value = "toadd";
        form1.submit();
    }
    else {
        alert('请选择一条记录！');
    }
}
//提交新增
function itemAdd(gourl) {
    form1.action = gourl;
    form1.doAction.value = "add";
    form1.submit();
}

//转到修改页面
function itemToUpdate1(gourl) {
    form1.action = gourl;
    form1.doAction.value = "toupdate1";
    form1.submit();
}
//转到浏览页面
function itemToDetail(gourl) {
    form1.action = gourl;
    form1.doAction.value = "detail";
    form1.submit();
}
//提交修改
function itemUpdate(gourl) {
    form1.action = gourl;
    form1.doAction.value = "update";
    form1.submit();
}

function itemToUpdate(url, method, width, height) {
    if (getSelectCount(form1.wybm) >= 1) {
        form1.action = url;
        try {
            var ids = "";
            var obj = form1.wybm;
            if (obj.length != null) {
                for (var tmp = 0; tmp < obj.length; tmp++) {
                    if (obj[tmp].checked) {
                        ids += obj[tmp].value + ",";
                    }
                }
                var n = (ids.split(',')).length - 1;
                if (n != 1) {
                    alert("请选择一条记录，再修改！");
                    return;
                }
                else {
                    form1.target = "_blank1";
                    window.open(url, "_blank1", "height=" + height + ",width=" + width + ",status=yes,toolbar=no,menubar=no,location=no,scrollbars=yes");
                }
            }
            form1.checkids.value = ids.substring(0, ids.length - 1);
        }
        catch (err) {

        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}

function itemToUpdateList4(url, method) {

    if (getSelectCount(form1.id) >= 1) {

        form1.action = url;

        try {

            var ids = "";
            var obj = form1.id;

            if (form1.id.length == null) {
                if (form1.id.checked) {
                    ids = form1.id.value;
                }
                form1.target = "_blank";
                form1.width = "2000px";
                form1.doAction.value = method;
                //   openwindow(url,'toaddwjgl',1000,750);
                form1.submit();
            }
            else {
                for (var tmp = 0; tmp < obj.length; tmp++) {
                    if (obj[tmp].checked) {
                        ids += obj[tmp].value + ",";
                    }
                }
                var n = (ids.split(',')).length - 1;
                if (n != 1) {
                    alert("请选择一条记录，再修改！");
                    return;
                } else {
                    form1.target = "_blank";
                    form1.doAction.value = method;
                    form1.submit();
                }
            }
            form1.checkids.value = ids;
        }
        catch (err) {

        }
    }
    else {
        alert('请至少选择一条记录！');
    }

}
//转到修改页面增加列表判断
function itemToUpdateList(gourl) {
    if (getSelectCount(form1.id) >= 1) {
        form1.action = gourl;
        form1.doAction.value = "toupdate";
        form1.submit();
    }
    else {
        alert('请选择一条记录！');
    }
}
//转到修改页面增加列表判断
function itemToUpdateList1(gourl) {
    if (getSelectCount(form1.indexNO) >= 1) {
        form1.action = gourl;
        form1.doAction.value = "toupdate";
        form1.submit();
    }
    else {
        alert('请选择一条记录！');
    }
}
//转到修改页面增加列表判断
function itemToUpdateList2(gourl) {
    if (getSelectCount(form1.indexNO) >= 1) {
        form1.action = gourl;
        form1.doAction.value = "toupdate1";
        form1.submit();
    }
    else {
        alert('请选择一条记录！');
    }
}
//转到修改页面增加列表判断
function itemToUpdateList3(gourl) {
    if (getSelectCount(form1.indexNO) >= 1) {
        form1.action = gourl;
        form1.doAction.value = "toupdate2";
        form1.submit();
    }
    else {
        alert('请选择一条记录！');
    }
}
//提交删除
function itemDel(gourl) {
    if (confirm("确定要删除吗？")) {
        form1.action = gourl;
        form1.doAction.value = "delete";
        form1.submit();
    }
}

//批量修改状态   假删除
function itemUpdateDelList(gourl, type) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定要删除吗？")) {
            form1.action = gourl;
            try {
                getIds();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "updatedelete";
            form1.submit();
        }

    }
    else {
        alert('请至少选择一条记录！');
    }
}

//提交删除增加列表判断
function itemDelList(gourl, type) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定删除吗？")) {
            form1.action = gourl;
            try {
                getIds();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "delete";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}

function itemDfzList(gourl, type) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定删除吗？")) {
            form1.action = gourl;
            try {
                getIds();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "updateState";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}

//提交删除增加列表判断
function itemDelList4(gourl, type) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定匹配吗？")) {
            form1.action = gourl;
            try {
                getQymcs();
            }
            catch (err) {

            }
            form1.doAction.value = "check";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}

//提交删除增加列表判断,徐凯
function itemDelListKevin(gourl, type, msg) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm(msg)) {
            form1.action = gourl;
            try {
                getIds();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "delete";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}

//提交删除增加列表判断
function itemAbolishList(gourl, type) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定废止吗？")) {
            form1.action = gourl;
            try {
                getIds();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "abolish";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}

//提交删除增加列表判断
function itemCommitList(gourl) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定提交吗？")) {
            form1.action = gourl;
            try {
                getIds();
            }
            catch (err) {

            }
            form1.doAction.value = "commit";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}

//提交删除增加列表判断（信用档案，产品召回  zyl）
function cpzhitemDelList(gourl, type) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定删除吗？")) {
            form1.action = gourl;
            try {
                getIds();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "cpzhxxdelete";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}

//按照指定的doAction执行删除操作
function itemDelListAndMethod(gourl, method) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定删除吗？")) {
            form1.action = gourl;
            try {
                getIds();

            }
            catch (err) {

            }
            form1.doAction.value = method;
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}

//提交删除图片
function itemDeltpList(gourl, type) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定要彻底删除图片吗？")) {
            form1.action = gourl;
            try {
                getIds();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "zpdelete";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}


//提交删除增加列表判断

function itemDelList1(gourl, type) {
    if (getSelectCount(form1.indexNO) >= 1) {
        if (confirm("确定要删除吗？")) {
            form1.action = gourl;
            try {
                getIds1();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "delete";
            form1.submit();
        }

    }
    else {
        alert('请至少选择一条记录！');
    }
}


//更新状态
function itemUpdateList(gourl, type) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定要删除吗？")) {
            form1.action = gourl;
            try {
                getIds();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "updateState";
            form1.submit();
        }

    }
    else {
        alert('请至少选择一条记录！');
    }
}

//恢复状态
function itemUpdateList1(gourl, type) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定要恢复吗？")) {
            form1.action = gourl;
            try {
                getIds();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "recover";
            form1.submit();
        }

    }
    else {
        alert('请至少选择一条记录！');
    }
}
//恢复状态
function itemUpdateList2(gourl, type) {
    if (getSelectCount(form1.wybm) >= 1) {
        if (confirm("确定要恢复吗？")) {
            form1.action = gourl;
            try {
                getWybms();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "recover";
            form1.submit();
        }

    }
    else {
        alert('请至少选择一条记录！');
    }
}
//手动多个匹配
function updateList(gourl, type) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定要匹配这些吗？")) {
            form1.action = gourl;
            try {
                getIds();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "update";
            form1.submit();
        }

    }
    else {
        alert('请至少选择一条记录！');
    }
}


//自动多个匹配
function updateList1(gourl, type) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定要匹配这些吗？")) {
            form1.action = gourl;
            try {
                getIds();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "zdpp";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}


//添加多个产品
function updateList2(gourl, type) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定要添加这些吗？")) {
            form1.action = gourl;
            try {
                getIds();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "tjcp";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}


//恢复状态
function updatehfList(gourl, type) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm("确定要恢复吗？")) {
            form1.hf.value = 1;
            form1.action = gourl;
            try {
                getIds();
                form1.deltype.value = type;
            }
            catch (err) {

            }
            form1.doAction.value = "updateState";
            form1.submit();
        }

    }
    else {
        alert('请至少选择一条记录！');
    }
}

//提交批量更新操作
function itemDelList2(url, msg, mathod) {
    if (getSelectCount(form1.id) >= 1) {
        if (confirm(msg)) {
            form1.action = url;
            try {
                getIds();
            }
            catch (err) {

            }
            form1.doAction.value = mathod;
            form1.submit();
        }

    }
    else {
        alert('请至少选择一条记录！');
    }
}

//提交归档列表
function itemToGuidangList(gourl) {
    if (getSelectCount(form1.slbh) >= 1) {
        if (confirm("确定提交归档吗?")) {
            form1.action = gourl;
//            getSlbhs();
            form1.checkslbhs.value = form1.slbhs.value;
            form1.doAction.value = "toguidang";
            form1.submit();
        }
    }
    else {
        alert('请至少选择一条记录！');
    }
}
//获取受理编号
function getSlbhs() {
    var slbhs = "";
    var obj = form1.slbh;
    if (form1.slbh.length == null) {
        if (form1.slbh.checked) {
            slbhs = form1.slbh.value;
        }
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {
            if (obj[tmp].checked) {
                slbhs += obj[tmp].value + ",";
            }
        }
    }
    form1.checkslbhs.value = slbhs;
}

//判断输入字符长度
function valueLength(obj, name, len) {
    if (obj.value.length > len) {
        alert(name + '长度不可以超过' + len);
        return false;
    }
    return true;
}

//限制输入字符长度
function valueLength1(obj, name, len) {

    if (obj.value.length > len) {
        alert(name + '长度不可以超过' + len + '!');
        obj.focus();
    }

}

//得到选择的字符串
function getIds1() {
    var ids = "";
    var obj = form1.indexNO;
    if (form1.indexNO.length == null) {
        if (form1.indexNO.checked) {
            ids = form1.indexNO.value;
        }
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {
            if (obj[tmp].checked) {
                ids += obj[tmp].value + ",";
            }
        }
    }
    form1.checkids.value = ids;

}

//得到选择的字符串
function getIds() {
    var ids = "";
    var obj = form1.id;
    if (form1.id.length == null) {
        if (form1.id.checked) {
            ids = form1.id.value;
        }
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {

            if (obj[tmp].checked) {
                ids += obj[tmp].value + ",";
            }
        }
    }
    form1.checkids.value = ids;
}

//得到选择的字符串
function getQymcs() {
    var ids = "";
    var obj = form1.id;
    if (form1.id.length == null) {
        if (form1.id.checked) {
            ids = form1.qymc1.value;
        }
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {
            if (obj[tmp].checked) {
                ids += form1.qymc1[tmp].value + ",";
            }
        }
    }
    form1.checkids.value = ids;
}

function getIdsLich() {
    var ids = "";
    var obj = form1.id;
    if (obj.length == null) {
        if (obj.checked && obj.disabled == false) {
            ids = obj.value;
        }
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {
            if (obj[tmp].checked && obj[tmp].disabled == false) {
                ids += obj[tmp].value + ",";
            }
        }
    }
    form1.checkids.value = ids;
}

//得到选择的字符串
function getIds2() {
    var ids = "";
    var obj = form1.id;
    if (form1.id.length == null) {
        if (form1.id.checked) {
            ids = form1.id.value;
        }
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {
            if (obj[tmp].checked) {
                ids += obj[tmp].value + ",";
            }
        }
    }
    form1.txlid.value = ids;
}

function itemDelList3(url, mathod) {
    if (getSelectCount(form1.id) >= 1) {

        form1.action = url;
        try {
            getIds();
        }
        catch (err) {

        }
        form1.doAction.value = mathod;
        form1.submit();


    }
    else {
        alert('请至少选择一条记录！');
    }
}
//得到选择的字符串
function getValues(obj) {
    var ids = "";
    if (obj.length == null) {
        if (obj.checked) {
            ids = obj.value;
        }
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {
            if (obj[tmp].checked) {
                ids += obj[tmp].value + ",";
            }
        }
    }
    form1.checkids.value = ids;
}


//得到选择的字符串
function getSelectValues(obj, obj2) {
    var ids = "";
    if (obj.length == null) {
        if (obj.checked) {
            ids = obj.value;
        }
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {
            if (obj[tmp].checked) {
                ids += obj[tmp].value + "、";
            }
        }
    }
    if (ids.length > 0) {
        ids = ids.substr(0, ids.length - 1);
    }
    obj2.value = ids;
}

//追加选择的字符串
function getSelectValues2(obj, obj2) {
    var ids = obj2.value;
    if (ids.length > 0) {
        ids += ",";
    }
    if (obj.length == null) {
        if (obj.checked) {
            ids = obj.value;
        }
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {
            if (obj[tmp].checked) {
                ids += obj[tmp].value + ",";
            }
        }
    }
    if (ids.length > 0) {
        ids = ids.substr(0, ids.length - 1);
    }
    obj2.value = ids;
}

//判断其值是否被选中
function isSelect(value) {
    var obj = form1.id;
    for (var tmp = 0; tmp < obj.length; tmp++) {
        if (obj[tmp].checked && obj[tmp].value == value) {
            return true;
        }
    }
    return false;
}

//判断其值是否被选中
function isSelectType(value) {
    var obj = form1.id;
    for (var tmp = 0; tmp < obj.length; tmp++) {
        if (obj[tmp].checked && obj[tmp].title == value) {
            return true;
        }
    }
    return false;
}


//得到复选框的值 fsteel
function getCheckBoxValues(obj, obj2) {//参数（复选框，存放结果的隐藏表单）
    var ids = "";
    if (obj == null) {
        obj2.value = "";
        return;
    }
    if (obj.length == null) {
        if (obj.checked) {
            ids = obj.value;
        }
    }
    else {
        for (var tmp = 0; tmp < obj.length; tmp++) {
            if (obj[tmp].checked) {
                ids += obj[tmp].value + ",";
            }
        }
    }
    if (ids.length > 0) {
        ids = ids.substr(0, ids.length - 1);
    }
    obj2.value = ids;
}
//回显checkedbox
function checkBoxHx(boxObj, backalue) {//参数（复选框，返回值（用，隔开）

    if (backValue = "" || boxObj == null) {
        return;
    }
    else {
        var values = backalue.split(',');
        for (var tmp = 0; tmp < boxObj.length; tmp++) {
            for (var j = 0; j < values.length; j++) {

                if (boxObj[tmp].value == values[j]) {
                    boxObj[tmp].checked = "checked";
                    break;
                }

            }

        }
    }


}


//打开一个弹出窗口
function openWin(endtarget, WINname, WINwidth, WINheight) {
    var showw = window.open(endtarget, WINname, 'status=no,toolbar=no, menubar=no, scrollbars=no, resizable=no,width=' + (WINwidth + 22) + ',height=' + WINheight);
    showw.focus();
}
//打开一个弹出窗口
function openWin3(endtarget, WINname, WINwidth, WINheight) {
    var showw = window.open(endtarget, WINname, 'status=no,toolbar=no, menubar=no, scrollbars=yes, resizable=no,width=' + (WINwidth + 22) + ',height=' + WINheight, "top=" + (screen.height / 2) + ",left=" + (screen.width / 2));
    showw.focus();
}
//打开一个弹出窗口
function openWin2(endtarget, WINname, WINwidth, WINheight) {
    var showw = window.open(endtarget, WINname, 'status=yes,toolbar=no,menubar=no,location=no,width=' + (WINwidth + 22) + ',height=' + WINheight);
    showw.focus();
}

//居中显示窗口
function openwindow(url, name, iWidth, iHeight) {
    var url;                             //转向网页的地址;
    var name;                            //网页名称，可为空;
    var iWidth;                          //弹出窗口的宽度;
    var iHeight;                         //弹出窗口的高度;
    //获得窗口的垂直位置
    var iTop = (window.screen.availHeight - 30 - iHeight) / 2;
    //获得窗口的水平位置
    var iLeft = (window.screen.availWidth - 10 - iWidth) / 2;
    window.open(url, name, 'height=' + iHeight + ',innerHeight=' + iHeight + ',width=' + iWidth + ',innerWidth=' + iWidth + ',top=' + iTop + ',left=' + iLeft + ',status=yes,toolbar=no,menubar=no,location=no,resizable=yes,scrollbars=yes,titlebar=no');
}


//居中显示窗口,模式窗体
function openwindowModel(url, name, iWidth, iHeight) {
    var url;                             //转向网页的地址;
    var name;                            //网页名称，可为空;
    var iWidth;                          //弹出窗口的宽度;
    var iHeight;                         //弹出窗口的高度;
    //获得窗口的垂直位置
    var iTop = (window.screen.availHeight - 30 - iHeight) / 2;
    //获得窗口的水平位置
    var iLeft = (window.screen.availWidth - 10 - iWidth) / 2;
    var answer = window.showModalDialog(url, name, 'dialogWidth=' + iWidth + 'px,dialogHeight=' + iHeight + 'px,top=' + iTop + ',left=' + iLeft + ',status=no,toolbar=no,menubar=no,location=no,resizable=no,scrollbars=yes,titlebar=no');
//    if(answer==1)
//    {
//    	window.location.href="/$!globals_sys_basename/private/sfxz.xp?doAction=FrameList&jgxlb=0101&jgmc=质监机构&type=1";
//    }
    // window.open(url,name,'height='+iHeight+',,innerHeight='+iHeight+',width='+iWidth+',innerWidth='+iWidth+',top='+iTop+',left='+iLeft+',status=no,toolbar=no,menubar=no,location=no,resizable=no,scrollbars=yes,titlebar=no');
}

//打开一个上传窗口
function upload2(domain, type, backobj, backmethod) {
    var temp = window.open("/" + domain + "/include/upload/upload.xp?upfiletype=" + type + "&retype=$!retype&backobj=" + backobj + "&backmethod=" + backmethod, "资料上传", "toolbar=0,location=0,top=0,left=0,directories=0,status=0,menubar=0,resizable=0,scrollbars=0,width=320,height=100,top=" + (screen.height / 2 - 50) + ",left=" + (screen.width / 2 - 160));
    temp.focus();
}

//打开一个上传窗口
function upload(domain, type, backobj, backmethod) {
    var temp = window.open("/" + domain + "/include/upload/upload.xp?upfiletype=" + type + "&backobj=" + backobj + "&backmethod=" + backmethod, "资料上传", "toolbar=0,location=0,top=0,left=0,directories=0,status=0,menubar=0,resizable=0,scrollbars=0,width=320,height=100,top=" + (screen.height / 2 - 50) + ",left=" + (screen.width / 2 - 160));
    temp.focus();
}

//得到下拉框的级别
function gettree(id) {

    var line = " ";
    var node = " ├";
    var restr = "";
    var count = id.length / 4;
    for (tmp = 1; tmp < count; tmp++) {
        restr += line;
    }
    return restr += node;


}

//得到下拉框的级别html代码方式
function gettreecode(id) {

    var line = "&nbsp;&nbsp;｜";
    var node = "&nbsp;&nbsp;├";
    var restr = "";
    var count = id.length / 4;
    for (tmp = 1; tmp < count; tmp++) {
        restr += line;
    }
    return restr += node;
}
//得到下拉框的级别html代码方式
function gettreecodejason(id) {

    var line = "  ｜";
    var node = "  ├";
    var restr = "";
    var count = id.length / 4;
    for (tmp = 1; tmp < count; tmp++) {
        restr += line;
    }
    return restr += node;
}

//得到下拉框的级别html代码方式
function gettreecode1(id) {

    var line = "&nbsp;";
    var node = "&nbsp;├";
    var restr = "";
    var count = id.length / 2;
    for (tmp = 1; tmp < count; tmp++) {
        restr += line;
    }
    return restr += node;
}

//得到下拉框的级别html代码方式
function gettreecode2(id) {

    var line = "&nbsp;";
    var node = "&nbsp;├";
    var restr = "";
    var count = id.length / 2;
    for (tmp = 1; tmp < count; tmp++) {
        restr += line;
    }
    return restr += node;

}

//得到资源的级别
function gettreemap(id, domain) {
    var line = "<img src='/" + domain + "/images/com/menu/line.png' border=0>";
    var node = "<img src='/" + domain + "/images/com/menu/mfc.gif' border=0><img src='/" + domain + "/images/com/menu/node.png' border=0>";
    var restr = "";
    var count = id.length / 4;
    for (tmp = 1; tmp < count; tmp++) {
        restr += line;
    }
    return restr += node;

}

//得到资源的级别
function gettreemap2(id, domain) {
    var line = "<img src='/" + domain + "/images/com/menu/line.png' border=0>";
    var node = "<img src='/" + domain + "/images/com/menu/mfc.gif' border=0><img src='/" + domain + "/images/com/menu/node.png' border=0>";
    var restr = "";
    var count = id.length / 2;
    for (tmp = 1; tmp < count; tmp++) {
        restr += line;
    }

    return restr += node;

}

//得到资源状态
function getstate(state, online) {
    if (state == online) {
        return "√";
    }
    else {
        return "×";
    }
}


function systourl(basename, id, url, menuname) {
    if (url.length > 0) {
        if (url.indexOf("http:") == 0) {
            if (url.indexOf('?') > 0) {
                parent.mainFrame.location.replace(basename + url + '&sys_menu=' + menuname + '&sys_menuid=' + id + '&sys_random=' + Math.random());
            }
            else {
                parent.mainFrame.location.replace(basename + url + '?sys_menu=' + menuname + '&sys_menuid=' + id + '&sys_random=' + Math.random());
            }
        }
        else {
            if (url.indexOf('.xp?') > 0) {
                parent.mainFrame.location.replace(basename + url + '&sys_menu=' + menuname + '&sys_menuid=' + id + '&sys_random=' + Math.random());
            }
            else {
                parent.mainFrame.location.replace(basename + url + '?sys_menu=' + menuname + '&sys_menuid=' + id + '&sys_random=' + Math.random());
            }
        }
    }
}
//验证手机号码有效型
//含固定电话和手机
//aut: jeff
//date: 2009-9-18
//"兼容格式: 130-139;150-159,180-189段手机号码"
//"兼容格式: 国家代码(2到3位)-区号(2到3位)-电话号码(7到8位)-分机号(2-5位)"
function isValidTel(obj, str) {
    String.prototype.Trim = function () {
        var m = this.match(/^\s*(\S+(\s+\S+)*)\s*$/);
        return (m == null) ? "" : m[1];
    }

    String.prototype.isMobile = function () {
        //"兼容格式: 130-139;150,151,152,153,158,159,188,189段手机号码"
        //return (/^(?:13\d|15[0123589]|18[89])-?\d{5}(\d{3}|\*{3})$/.test(this.Trim()));
        //"兼容格式: 130-139;150-159,180-189段手机号码"
        return (/^(?:13\d|15\d|18\d|14\d)-?\d{5}(\d{3}|\*{3})$/.test(this.Trim()));
    }
    String.prototype.isTel = function () {
        //"兼容格式: 国家代码(2到3位)-区号(2到3位)-电话号码(7到8位)-分机号(2-5位)"
        return (/^(([0\+]\d{2,3}-)?(0\d{2,3})-)?(\d{7,8})(-(\d{2,5}))?$/.test(this.Trim()));
    }
    var result = chkTEL();
    return  result;
    function chkTEL() {
        if (obj.value.isMobile() || obj.value.isTel()) {
            obj.value = obj.value.Trim();
            return true;
        }
        else {
            //alert("无效的" + str + "！");
            alert("请输入正确的手机号码或电话号码!");
            obj.focus();
            obj.value = "";
            return false;
        }
    }
}


function isValidTel2(obj, str, name) {
    String.prototype.Trim = function () {
        var m = this.match(/^\s*(\S+(\s+\S+)*)\s*$/);
        return (m == null) ? "" : m[1];
    }

    String.prototype.isMobile = function () {
        //"兼容格式: 130-139;150,151,152,153,158,159,188,189段手机号码"
        //return (/^(?:13\d|15[0123589]|18[89])-?\d{5}(\d{3}|\*{3})$/.test(this.Trim()));
        //"兼容格式: 130-139;150-159,180-189段手机号码"
        return (/^(?:13\d|15\d|18\d)-?\d{5}(\d{3}|\*{3})$/.test(this.Trim()));
    }
    String.prototype.isTel = function () {
        //"兼容格式: 国家代码(2到3位)-区号(2到3位)-电话号码(7到8位)-分机号(2-5位)"
        return (/^(([0\+]\d{2,3}-)?(0\d{2,3})-)?(\d{7,8})(-(\d{2,5}))?$/.test(this.Trim()));
    }
    var result = chkTEL();
    return  result;
    function chkTEL() {
        if (obj.value.isMobile() || obj.value.isTel()) {
            obj.value = obj.value.Trim();
            return true;
        }
        else {
            //alert("无效的" + str + "！");
            // alert("请输入正确的手机号码或电话号码!");
            alert("请输入正确的" + name + "!");
            obj.focus();
            obj.value = "";
            return false;
        }
    }
}


//验证固定电话有效性
//aut: wqy
//date: 2013-02-04
//"兼容格式: 国家代码(2到3位)-区号(2到3位)-电话号码(7到8位)-分机号(2-5位)"
function isValidLxdh(obj, str) {
    String.prototype.Trim = function () {
        var m = this.match(/^\s*(\S+(\s+\S+)*)\s*$/);
        return (m == null) ? "" : m[1];
    }
    String.prototype.isTel = function () {
        //"兼容格式: 国家代码(2到3位)-区号(2到3位)-电话号码(7到8位)-分机号(2-5位)"
        return (/^(([0\+]\d{2,3}-)?(0\d{2,3})-)?(\d{7,8})(-(\d{2,5}))?$/.test(this.Trim()));
    }
    var result = chkLxdh();
    return  result;
    function chkLxdh() {
        if (obj.value.isTel()) {
            obj.value = obj.value.Trim();
            return true;
        }
        else {
            alert("无效的" + str + "！");
            //alert("请输入正确的手机号码或电话号码!");
            obj.focus();
            obj.value = "";
            return false;
        }
    }
}


//验证手机号码有效性
//aut: wqy
//date: 2013-02-04
//"兼容格式: 130-139;150-159,180-189段手机号码"
function isValidMobile(obj, str) {
    String.prototype.Trim = function () {
        var m = this.match(/^\s*(\S+(\s+\S+)*)\s*$/);
        return (m == null) ? "" : m[1];
    }

    String.prototype.isMobile = function () {
        //"兼容格式: 130-139;150,151,152,153,158,159,188,189段手机号码"
        //return (/^(?:13\d|15[0123589]|18[89])-?\d{5}(\d{3}|\*{3})$/.test(this.Trim()));
        //"兼容格式: 130-139;150-159,180-189段手机号码"
        //
        return (/^(?:13\d|14\d|15\d|18\d)-?\d{5}(\d{3}|\*{3})$/.test(this.Trim()));
    }

    var result = chkMobile();
    return  result;
    function chkMobile() {
        if (obj.value.isMobile()) {
            obj.value = obj.value.Trim();
            return true;
        }
        else {
            alert("无效的" + str + "！");
            //alert("请输入正确的手机号码或电话号码!");
            obj.focus();
            obj.value = "";
            return false;
        }
    }
}


/* 判断输入文本框的字符是否超过最大长度（包括中文）
 * @param formObject=form对象
 * @param message=form对象的界面标签显示值
 * @return 若合法，则返回true
 */
function checkInputLength(formObject, message, inputMaxLength) {
    var i;
    var num = 0;
    var inputStr = formObject.value;

    for (i = 0; i < inputStr.length; i++) {
        num++;
        if (inputStr.charCodeAt(i) > 255) {
            num++;
        }
    }

    if (num > inputMaxLength) {
        alert("您输入的" + message + "长度超过" + inputMaxLength + "字符，请从新输入！！");
        formObject.focus();
        return false;
    }
    return true;
}


//JSHASHTABLE实现
function Hashtable() {
    this._hash = new Object();
    this.add = function (key, value) {
        if (typeof(key) != "undefined") {
            if (this.contains(key) == false) {
                this._hash[key] = typeof(value) == "undefined" ? null : value;
                return true;
            } else {
                this._hash[key] = typeof(value) == "undefined" ? null : value;
                return false;
            }
        } else {
            return false;
        }
    }
    this.remove = function (key) {
        delete this._hash[key];
    }
    this.count = function () {
        var i = 0;
        for (var k in this._hash) {
            i++;
        }
        return i;
    }
    this.items = function (key) {
        var htvalue = this._hash[key];
        if (htvalue != undefined) {
            return htvalue;
        }
        else {
            return "";
        }
    }
    this.contains = function (key) {
        return typeof(this._hash[key]) != "undefined";
    }
    this.clear = function () {
        for (var k in this._hash) {
            delete this._hash[k];
        }
    }
}

// ReYoPrint控件打印预览 纵向
function preview(oper) {
    if (oper < 10) {
        bdhtml = window.document.body.innerHTML;
        //获取当前页的html代码
        sprnstr = "<!--startprint" + oper + "-->";
        //设置打印开始区域
        eprnstr = "<!--endprint" + oper + "-->";
        //设置打印结束区域
        prnhtml = bdhtml.substring(bdhtml.indexOf(sprnstr) + 18);
        //从开始代码向后取html

        prnhtml = prnhtml.substring(0, prnhtml.indexOf(eprnstr));
        //从结束代码向前取html
        window.document.body.innerHTML = prnhtml;
        //window.print();
        ReYoPrint.PrintPreview();
        window.document.body.innerHTML = bdhtml;

    } else {
        //window.print();
        ReYoPrint.PrintPreview();
    }
}
// ReYoPrint控件打印预览 横向
function previewLevel(oper) {
    if (oper < 10) {
        bdhtml = window.document.body.innerHTML;
        //获取当前页的html代码
        sprnstr = "<!--startprint" + oper + "-->";
        //设置打印开始区域
        eprnstr = "<!--endprint" + oper + "-->";
        //设置打印结束区域
        prnhtml = bdhtml.substring(bdhtml.indexOf(sprnstr) + 18);
        //从开始代码向后取html

        prnhtml = prnhtml.substring(0, prnhtml.indexOf(eprnstr));
        //从结束代码向前取html
        window.document.body.innerHTML = prnhtml;
        //window.print();
        ReYoPrint.IsLandScape = 1;
        //把页面设置为横向1
        ReYoPrint.PrintPreview();
        window.document.body.innerHTML = bdhtml;

    } else {
        //window.print();
        ReYoPrint.IsLandScape = 1;
        ReYoPrint.PrintPreview();
    }
}
// ReYoPrint控件打印预览 纵向 页边距参数
function previewandmargin(oper, lmargin, rmargin, tmargin, bmargin) {
    if (oper < 10) {
        bdhtml = window.document.body.innerHTML;
        //获取当前页的html代码
        sprnstr = "<!--startprint" + oper + "-->";
        //设置打印开始区域
        eprnstr = "<!--endprint" + oper + "-->";
        //设置打印结束区域
        prnhtml = bdhtml.substring(bdhtml.indexOf(sprnstr) + 18);
        //从开始代码向后取html

        prnhtml = prnhtml.substring(0, prnhtml.indexOf(eprnstr));
        //从结束代码向前取html
        window.document.body.innerHTML = prnhtml;

        if (lmargin != null) {
            ReYoPrint.MarginLeft = lmargin;
        }
        if (rmargin != null) {
            ReYoPrint.MarginRight = rmargin;
        }
        if (tmargin != null) {
            ReYoPrint.MarginTop = tmargin;
        }
        if (bmargin != null) {
            ReYoPrint.MarginTop = bmargin;
        }
        ReYoPrint.PrintPreview();
        window.document.body.innerHTML = bdhtml;
    } else {
        //window.print();
        ReYoPrint.PrintPreview();
    }
}

//主要用于弹出窗口的关闭， 并使父窗口聚焦
function doclose() {
    try {
        window.opener.focus();
    }
    catch (e) {
    }
    window.close();
}

//关闭弹出窗口，并刷新父页面
function docolse2(url) {
    try {
        window.opener.focus();
        window.opener.location = url;
        //window.opener.location.reload();
    }
    catch (e) {
    }
    window.close();
}

//列表刷新
function getFormElement(element, value) {
    var obj = window.opener.document.getElementById(element);
    if (obj != null)
        obj.value = value;
}

function openerSubmit() {
    try {
        window.opener.focus();
        var form1 = window.opener.document.getElementById("form1");
        getFormElement("curPage", "1");
        form1.submit();
    }
    catch (e) {
    }
    window.close();
}

function openerSubmitPage() {
    try {
        window.opener.focus();
        var form1 = window.opener.document.getElementById("form1");
        form1.submit();
    }
    catch (e) {
    }
    window.close();
}

function openerSubmit1(url, doAction) {
    try {
        window.opener.focus();
        var form1 = window.opener.document.getElementById("form1");
        getFormElement("curPage", "1");
        form1.action = url;
        form1.doAction.value = doAction;
        form1.submit();
    }
    catch (e) {
    }
    window.close();
}

function openerSubmit2(url, doAction, parameters, parameterValues) {
    try {
        window.opener.focus();
        getFormElement("curPage", "1");
        if (parameters.length > 0 && parameterValues.length > 0 && parameters.length == parameterValues.length) {
            for (var i = 0; i < parameters.length; i++) {
                getFormElement(parameters[i], parameterValues[i]);
            }
        }
        var form1 = window.opener.document.getElementById("form1");
        form1.action = url;
        form1.doAction.value = doAction;
        form1.submit();
    }
    catch (e) {
    }
    window.close();
}

function docolse3(url) {
    try {
        window.opener.focus();
        parent.location = url;
        //window.opener.location.reload();
    }
    catch (e) {
    }
    window.close();
}
//不通用
function doclosefs(url, bzflag, url2) {
    try {
        if (bzflag != 1) {
            window.location = url;
        }
        else {
            window.opener.focus();
            window.opener.location = url2;
            window.opener.location.reload();
            //window.opener=null;
            //window.open('', '_self', '');
            window.close();
        }

    }
    catch (e) {
    }

}
function docloseModal(retVal) {
    //retVal=="refresh"则刷新父窗体
    window.returnValue = retVal;   //   关闭前赋返回值标志
    window.close();
}

//关闭弹出窗口，并刷新父页面
function doClosetoFrame(url) {
    try {
        window.opener.focus();
        window.opener.document.location = url;
        //window.opener.location.reload();
    }
    catch (e) {
    }
    window.close();
}


function fdate(obj) {
    var str = obj.value;
    obj.value = str.replace("--", "-");

    var sL = str.length;
    if (!isNumber(str)) {
        obj.value = str.substring(0, (sL - 1));
    } //只能输入从0到9的数字和‘-’号。
    if (sL == 4) {
        obj.value = str + "-";
    }
    if (sL == 6 && event.keyCode != 8) {
        if (Number(str.substring(5, 6)) > 1) {
            obj.value = str.substring(0, 5) + "0" + str.substring(5, 6);
            obj.value = obj.value + "-";
            obj.value = obj.value.replace("--", "-");
        }
    }
    if (sL == 7 && event.keyCode != 8) {
        if (str.substring(6, 7) != "-") {
            if (Number(str.substring(5, 7)) > 12) {
                obj.value = str.substring(0, (sL - 1));
            }
        }
        obj.value = str + "-";
        obj.value = obj.value.replace("--", "-");
    }
    if (sL > 7 && event.keyCode != 8) {
        if (sL == 8) {
            if (str.substring(8, (sL - 1)) != "-") {
                obj.value = str.substring(0, (sL - 1)) + "-" + str.substring((sL - 1), sL);
            }
        } else if (sL == 9) {
            if (str.substring(9, (sL - 1)) > 3) {
                obj.value = str.substring(0, (sL - 1)) + "0" + str.substring((sL - 1), sL);
            }
        } else if (Number(str.substring(8)) > 31) {
            obj.value = str.substring(0, (sL - 1));
        }
    }

}
function isNumber(String) {
    var Letters = "1234567890-|"; //可以自己增加可输入值
    var i;
    var c;
    if (String.charAt(0) == '|')
        return false;
    if (String.charAt(String.length - 1) == '|')
        return false;
    for (i = 0; i < String.length; i++) {
        c = String.charAt(i);
        if (Letters.indexOf(c) < 0)
            return false;
    }
    return true;
}

function isDate(str) {

    var a = str.match(/^((((1[6-9]|[2-9]\d)\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\d|3[01]))|(((1[6-9]|[2-9]\d)\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\d|30))|(((1[6-9]|[2-9]\d)\d{2})-0?2-(0?[1-9]|1\d|2[0-8]))|(((1[6-9]|[2-9]\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$/);
    if (a == null) return true;
    return false;
}
function cdate(obj) {
    var str = obj.value;
    if (str != "" && isDate(str)) {
        alert("日期格式不正确，请重新输入。");
        obj.value = "";
        obj.focus();
        return false;
    }
}

function tosdppByWindow(url, a, b) {
    try {
        var ids = "";
        var obj = form1.id;
        if (form1.id.length == null) {
            if (form1.id.checked) {
                ids = form1.id.value;
            }
        }
        else {
            for (var tmp = 0; tmp < obj.length; tmp++) {
                if (obj[tmp].checked) {
                    ids += obj[tmp].value + ",";
                }
            }
            var n = (ids.split(',')).length - 1;
            if (n != 1) {
                alert("请选择一条记录，再匹配！");
                return;
            }
        }
        form1.checkids.value = ids;
        // var url="/$!globals_sys_basename/private/manager/unit.xp?doAction=toupdate&ids="+ids+"&sjs="+Math.random();
        var url2 = url + "&id=" + ids.replace(",", "");
        openwindow(url2, 'toupdate', screen.width, screen.height);
    }
    catch (err) {

    }
}
/**
 * 鼠标事件
 * 处理下拉框设置为固定，信息内容显示不全--杨坤
 * @param selectObj
 */
function FixWidth(selectObj) {
    var newSelectObj = document.createElement("select");
    newSelectObj = selectObj.cloneNode(true);
    newSelectObj.selectedIndex = selectObj.selectedIndex;
    newSelectObj.id = "newSelectObj_yk";

    var e = selectObj;
    var absTop = e.offsetTop;
    var absLeft = e.offsetLeft;
    while (e = e.offsetParent) {
        absTop += e.offsetTop;
        absLeft += e.offsetLeft;
    }
    with (newSelectObj.style) {
        position = "absolute";
        top = absTop + "px";
        left = absLeft + "px";
        width = "auto";
    }

    var rollback = function () {
        RollbackWidth(selectObj, newSelectObj);
    };
    try {
        if (window.addEventListener) {
            newSelectObj.addEventListener("blur", rollback, false);
            newSelectObj.addEventListener("change", rollback, false);
        } else {
            newSelectObj.attachEvent("onblur", rollback);
            newSelectObj.attachEvent("onchange", rollback);
        }
    } catch (e) {
    }
    selectObj.style.visibility = "hidden";
    document.body.appendChild(newSelectObj);

    var newDiv = document.createElement("div");
    with (newDiv.style) {
        position = "absolute";
        top = (absTop - 10) + "px";
        left = (absLeft - 10) + "px";
        width = newSelectObj.offsetWidth + 20;
        height = newSelectObj.offsetHeight + 20;
        background = "transparent";
    }
    document.body.appendChild(newDiv);
    newSelectObj.focus();
    var enterSel = "false";
    var enter = function () {
        enterSel = enterSelect();
    };
    newSelectObj.onmouseover = enter;

    var leavDiv = "false";
    var leave = function () {
        leavDiv = leaveNewDiv(selectObj, newSelectObj, newDiv, enterSel);
    };
    newDiv.onmouseleave = leave;
}

function RollbackWidth(selectObj, newSelectObj) {
    selectObj.selectedIndex = newSelectObj.selectedIndex;
    selectObj.style.visibility = "visible";
    try {

        if (document.getElementById("newSelectObj_yk") != null) {
            document.body.removeChild(newSelectObj);
        }
    } catch (e) {
    }
}

function removeNewDiv(newDiv) {
    document.body.removeChild(newDiv);
}

function enterSelect() {
    return "true";
}

function leaveNewDiv(selectObj, newSelectObj, newDiv, enterSel) {
    if (enterSel == "true") {
        RollbackWidth(selectObj, newSelectObj);
        removeNewDiv(newDiv);
    }
}

function showLoad() {

    if (window.parent.document.getElementById("_LoadingIcon")) {
        //window.parent.document.getElementById("_LoadingIconDiv").style.display ="none";
        window.parent.document.body.removeChild(window.parent.document.getElementById("_LoadingIcon"));
    }
    var icondiv = parent.document.createElement("div");
    icondiv.id = "_LoadingIcon";

    icondiv.style.display = "none";
    icondiv.innerHTML = "<div style='margin-left:30px;margin-top:33px;'><span style='display:inline-block;'><img src='/zjpt/images/progressBar/progressBar_l.gif'></span></div> ";
    icondiv.style.cssText = "padding-top:5px;position:absolute;background:url(/zjpt/images/progressBar/background1.gif) no-repeat;z-index:9999;height:70px;width:320px";
    icondiv.style.top = ( screen.height / 2 - 150) + "px";
    icondiv.style.left = (screen.width / 2 - 200) + "px";

    icondiv.style.padding = "5px";

    //document.body.appendChild(icondiv);
    window.parent.document.body.appendChild(icondiv);
    icondiv.style.display = "block";
}

function closeLoad() {
    if (window.parent.document.getElementById("_LoadingIcon")) {
        //window.parent.document.getElementById("_LoadingIconDiv").style.display ="none";
        window.parent.document.body.removeChild(window.parent.document.getElementById("_LoadingIcon"));
    }
}

function trimInputValue() {
    var list = document.getElementsByTagName("input");
    for (var i = 0; i < list.length && list[i]; i++) {
        //判断是否为文本框
        if (list[i].type == "text") {
            list[i].value = list[i].value.replace(/^\s+|\s+$/g, "");
        }
    }
}

/**
 * 获取预警图片
 * @param id  td的ID
 * @param code  预警编码
 * @param name  预警名称
 */
function getWarnImageAndName(id, code, name) {
    var str = "";
    if (name != "" && (code.indexOf("001") != -1 || code.indexOf("012") != -1 )) {
        str = "<img src=\"/czxmgl/images/private/czxm/yellow.gif\" style=\"height:22px\"/>" + name;
    } else if (name != "") {
        str = "<img src=\"/czxmgl/images/private/czxm/red.gif\" style=\"height:22px\"/>" + name;
    } else {
        str = "&nbsp;";
    }
    document.getElementById(id).innerHTML = str;
}

/**
 * 根据当前登录用户判断该资金下是否存在“关于审核批准预警项目的函”
 * @param zxzjbm
 */
function getIsExistFileByZxzjAndUser(zxzjbm) {
    var str = "<a href=\"/$!globals_sys_basename/DownFile?exportAction=file&filepath=$!obj.jxmbwjlj&filename=$!obj.jxmbwjmc\">浏览</a>";
    jQuery.ajax({
        url: "/$!globals_sys_basename/private/czxmgl/current.xp",
        data: {doAction: 'getIsExistFileByZxzjAndUser', zxzjbm: zxzjbm},
        type: "POST",
        success: function (str) {
            if (str == "true") {//弹出列表

            } else if (str == "false") {
                str = "";
            } else {

            }
        }, error: function (e) {
            alert(e);
        }
    });

}
function uploadsix(domain, type, backname, backobj, flag, backmethod) {
    var temp = window.open("/" + domain + "/include/upload/upload.xp?upfiletype=" + type + "&backname=" + backname + "&backobj=" + backobj + "&flag=" + flag + "&backmethod=" + backmethod + "&doAction=yjgz", "文件上传", "toolbar=0,location=0,top=0,left=0,directories=0,status=0,menubar=0,resizable=0,scrollbars=0,width=420,height=140");
    temp.focus();
}

function downloadwj(domain,path){
	var url="/" + domain + "/include/upload/upload.xp?doAction=download&xzwjlj="+encodeURI(encodeURI(path));
	window.location.href=url;
//	alert(url);
}

/**
 * 检查联系方式是否正确
 * @param msg  提示语
 * @param obj 验证对象
 */
function checkPhoneNumber(msg, obj) {
    var value = obj.value;
    if (value != null && value != "") {
        var reg = /((\d{11})|^((\d{7,8})|(\d{4}|\d{3})-(\d{7,8})|(\d{4}|\d{3})-(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1})|(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1}))$)/;
        if (!reg.test(value)) {
            alert(msg + "格式无效,如：0551-12345678或11位手机号!");
            obj.select();
            return false;
        }
    }
    return true;
}

/**
 * 检查身份证号码是否正确
 * @param msg  提示语
 * @param obj 验证对象
 */
function checkIdCardNo(msg, obj) {
    var sId = obj.value;
    var aCity = {11: "北京", 12: "天津", 13: "河北", 14: "山西", 15: "内蒙古", 21: "辽宁", 22: "吉林", 23: "黑龙江", 31: "上海", 32: "江苏", 33: "浙江",
        34: "安徽", 35: "福建", 36: "江西", 37: "山东", 41: "河南", 42: "湖北", 43: "湖南", 44: "广东", 45: "广西", 46: "海南", 50: "重庆", 51: "四川",
        52: "贵州", 53: "云南", 54: "西藏", 61: "陕西", 62: "甘肃", 63: "青海", 64: "宁夏", 65: "新疆", 71: "台湾", 81: "香港", 82: "澳门", 91: "国外"}
    var iSum = 0
    if (!/^\d{17}(\d|x)$/i.test(sId)) {
        alert(msg + "格式错误!");
        obj.select();
        return false;
    }
    sId = sId.replace(/x$/i, "a");
    if (aCity[parseInt(sId.substr(0, 2))] == null) {
        alert(msg + "格式错误!");
        obj.select();
        return false;
    }
    var sBirthday = sId.substr(6, 4) + "-" + Number(sId.substr(10, 2)) + "-" + Number(sId.substr(12, 2));
    var d = new Date(sBirthday.replace(/-/g, "/"))
    if (sBirthday != (d.getFullYear() + "-" + (d.getMonth() + 1) + "-" + d.getDate())) {
        alert(msg + "格式错误!");
        obj.select();
        return false;
    }
    for (var i = 17; i >= 0; i--) {
        iSum += (Math.pow(2, i) % 11) * parseInt(sId.charAt(17 - i), 11)
    }
    if (iSum % 11 != 1) {
        alert(msg + "格式错误!");
        obj.select();
        return false;
    }
}


/**
 * 检查身份证号码是否正确
 * @param msg  提示语
 * @param obj 验证对象
 */
function checkIdCardNo2(msg, obj) {
    var sId = obj.value;
    var aCity = {11: "北京", 12: "天津", 13: "河北", 14: "山西", 15: "内蒙古", 21: "辽宁", 22: "吉林", 23: "黑龙江", 31: "上海", 32: "江苏", 33: "浙江",
        34: "安徽", 35: "福建", 36: "江西", 37: "山东", 41: "河南", 42: "湖北", 43: "湖南", 44: "广东", 45: "广西", 46: "海南", 50: "重庆", 51: "四川",
        52: "贵州", 53: "云南", 54: "西藏", 61: "陕西", 62: "甘肃", 63: "青海", 64: "宁夏", 65: "新疆", 71: "台湾", 81: "香港", 82: "澳门", 91: "国外"}
    var iSum = 0
    if (!/^\d{17}(\d|x)$/i.test(sId)) {
        //alert(msg + "格式错误!");
       // obj.select();
        return msg + "格式错误!";
    }
    sId = sId.replace(/x$/i, "a");
    if (aCity[parseInt(sId.substr(0, 2))] == null) {
        //alert(msg + "格式错误!");
        //obj.select();
        return msg + "格式错误!";
    }
    var sBirthday = sId.substr(6, 4) + "-" + Number(sId.substr(10, 2)) + "-" + Number(sId.substr(12, 2));
    var d = new Date(sBirthday.replace(/-/g, "/"))
    if (sBirthday != (d.getFullYear() + "-" + (d.getMonth() + 1) + "-" + d.getDate())) {
        //alert(msg + "格式错误!");
        //obj.select();
        return msg + "格式错误!";
    }
    for (var i = 17; i >= 0; i--) {
        iSum += (Math.pow(2, i) % 11) * parseInt(sId.charAt(17 - i), 11)
    }
    if (iSum % 11 != 1) {
        //alert(msg + "格式错误!");
        //obj.select();
        return msg + "格式错误!";
    }
    return "";
}
