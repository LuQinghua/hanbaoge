/**
 * @authors Gogogo
 * @date    2015-08-31 11:29:15
 * @version $购物车功能JS$
 */

window.onload = function() {
	//低版本IE不支持document.getElementsByClassName的解决方法;
	if (!document.getElementsByClassName) {
		document.getElementsByClassName = function (cls){
			var ret = [];																																				//创建存放获取目标对象的数组;
			var els = document.getElementsByTagName('*');   																		//获取所有标签;
			for (var i = 0,len = els.length; i < len; i++) {

				if (els[i].className === cls
					|| els[i].className.indexOf(cls + ' ')>=0
					|| els[i].className.indexOf(' ' + cls + ' ')>=0
					|| els[i].className.indexOf(' ' + cls)>=0) {																		//判断所有标签里是否包含有目标对象;
					ret.push(els[i]);																																//将判断出来的目标对象存放入数组;
				};

			};

			return ret;																															 						//并返回值;
		};
	}

	var cartTable = document.getElementById('cartTable');
	var tr = cartTable.children[1].rows;							            													//rows:表格元素特有属性，存放节点所有tr元素
	var checkInputs = document.getElementsByClassName('check');															//复选框
	var checkAllInputs = document.getElementsByClassName('check-all');											//全选复选框
	var selectedTotal = document.getElementById('selectedTotal');														//定义件数总数
	var priceTotal = document.getElementById('priceTotal');																	//定义价格总数
	var selected = document.getElementById('selected');																			//已选商品
	var clearingBar = document.getElementById('clearingBar');																//底部结算栏
	var selectedViewList = document.getElementById('selectedViewList');											//已选商品图片显示层
	var deleteAll = document.getElementById('deleteAll');																		//全选删除
	var checkOne = document.getElementsByClassName('check-one');														//单一复选框

	//计算
	function getTotal(){
		var seleted = 0;
		var price = 0;
		var HTMLstr = '';
		for (var i = 0,len = tr.length; i<len; i++) {
			if (tr[i].getElementsByTagName('input')[0].checked) {
					tr[i].className="on";																														//商品选中"on"
					seleted += parseInt(tr[i].getElementsByTagName('input')[1].value);  						//件数计算,parseInt转整数值;
					price += parseFloat(tr[i].cells[4].innerHTML);					    										//价格计算,parseFloat转小数;
					HTMLstr += '<div><img src="'+ tr[i].getElementsByTagName('img')[0].src+'"><span class="del" index="'+i+'">取消选择</span></div>'
			}else{																																							//显示已选商品图片显示层
					tr[i].className="";
			}
		};

		selectedTotal.innerHTML = seleted;																										//件数总数赋值
		priceTotal.innerHTML = price.toFixed(2);																							//价格总数赋值,保留两位小数;
		selectedViewList.innerHTML =  HTMLstr;																								//显示已选商品图片显示层

		if(seleted == 0){
			clearingBar.className = 'clearingBar';																							//已选商品数为0时，已选商品图片显示层不出现
		}
	}

	//小计
	function getSubTotal(tr){
			var tds = tr.cells;
			var price =  parseFloat(tds[2].innerHTML)
			var count = parseInt(tr.getElementsByTagName('input')[1].value);
			var SubTotal = parseFloat(price * count);
			tds[4].innerHTML = SubTotal.toFixed(2);
	}

	//复选框
	for (var i = 0, len = checkInputs.length; i < len; i++) {
	 	checkInputs[i].onclick = function (){

	 		if (this.className === 'check-all check') {							   													 //选中全选复选框,则所有复选框选中
	 			for (var j = 0; j < checkInputs.length; j++) {
	 				checkInputs[j].checked = this.checked;
	 					};
	 		};

	 		if (this.checked == false) {										   				 													//取消选中任一复选框,则全选复选框取消选中
	 			for (var k = 0; k < checkAllInputs.length; k++) {
	 				checkAllInputs[k].checked = false;
	 			};
	 		};

	 	 getTotal();

  		if(this.className==='check-one check'){																							//全部复选框选中，则全选复选框选中
 			var count = 0;
 			for(var l = 0;l < checkOne.length;l++){
 				if(checkOne[l].checked){
 					count++;
 					}
 				};
 			if(count == checkOne.length){
 				for(var m = 0;m < checkAllInputs.length;m++){
 					checkAllInputs[m].checked = true;
 		 				}
 		 			}
 		 		}
 		 	};
	}


	//删除
	selected.onclick = function(){
		if(clearingBar.className == 'clearingBar'){
			if(selectedTotal.innerHTML != 0){
				clearingBar.className = 'clearingBar show';
			}
		}else{
			clearingBar.className = 'clearingBar';
		}
	}

	//已选商品取消选择
	selectedViewList.onclick = function (e){
		e = e || window.event;
		var el = e.srcElement||e.target;																										//e.target解决处理firefox浏览器不兼容srcElements
		if (el.className == 'del') {
			var index = el.getAttribute('index');
			var input = tr[index].getElementsByTagName('input')[0];
			input.checked = false;
			input.onclick();
		}
	}

	//加减按钮计数
	for (var i = 0; i < tr.length; i++) {
			tr[i].onclick = function(e){
				e = e || window.event;
				var el = e.srcElement||e.target;
				var cls = el.className;
				var input = this.getElementsByTagName('input')[1];
				var val = parseInt(input.value);
				var reduce = this.getElementsByTagName('span')[0];
				switch(cls){
					case 'add':
							input.value = val + 1;
							reduce.innerHTML = '-';
							getSubTotal(this);
							break;
					case 'reduce':
							if (val > 1) {
								input.value = val - 1;
								reduce.innerHTML = '-';
							}
							if (input.value == 1) {
								reduce.innerHTML = '';
							};
							getSubTotal(this);
							break;
					case 'delete':
							 var conf = confirm('确定要删除吗？');
							 if(conf){
							 		this.parentNode.removeChild(this);
							 }
							 break;
					default:
							break;
				}

				getTotal();
			}
			//键盘输入数值计数
			tr[i].getElementsByTagName('input')[1].onkeyup = function () {
				var val = parseInt(this.value);
				var tr = this.parentNode.parentNode;
				var reduce = tr.getElementsByTagName('span')[0];
				//输入的数值只能是整数1或大于1
				if (isNaN(val) || val < 1) {
						val = 1;
				}
				this.value = val;

				if(val <= 1){
						reduce.innerHTML = '';
				}else{
						reduce.innerHTML = '-';
				}
				getSubTotal(tr);
				getTotal();
			}
	};

	//全选删除
	deleteAll.onclick = function(){
		if (selectedTotal.innerHTML != '0') {
				var conf = confirm('确定要删除吗？');
				if(conf){
					for(var i = 0; i < tr.length; i++){
							var input = tr[i].getElementsByTagName('input')[0];
							if(input.checked){
								tr[i].parentNode.removeChild(tr[i]);
								i --;																															//回置下标i,删除多个选中层时删除对应的选中层
							}
					}
				};
		};
		for (var k = 0; k < checkAllInputs.length; k++) {
			checkAllInputs[k].checked = false;
		};
		getTotal();
	}

	checkAllInputs[0].checked = true;																								//页面打开默认全选商品
	checkAllInputs[0].onclick();
}



