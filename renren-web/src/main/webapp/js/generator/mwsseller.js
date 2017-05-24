$(function () {
    $("#jqGrid").jqGrid({
        url: '../mwsseller/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '用户ID', name: 'userId', index: 'user_id', width: 80 }, 			
			{ label: 'accessKeyId', name: 'accessKeyId', index: 'access_key_id', width: 80 }, 			
			{ label: 'sellerId', name: 'sellerId', index: 'seller_id', width: 80 }, 			
			{ label: 'secret_access_key', name: 'secretAccessKey', index: 'secret_access_key', width: 80 }, 			
			{ label: 'APP_NAME', name: 'appName', index: 'app_name', width: 80 }, 			
			{ label: 'APP_VERSION', name: 'appVersion', index: 'app_version', width: 80 }, 			
			{ label: 'MWS_AUTH_TOKEN', name: 'mwsAuthToken', index: 'MWS_AUTH_TOKEN', width: 80 }, 			
			{ label: 'MARKETPLACE_ID_CA', name: 'marketplaceIdCa', index: 'marketplace_id_ca', width: 80 }, 			
			{ label: 'MARKETPLACE_ID_US', name: 'marketplaceIdUs', index: 'marketplace_id_us', width: 80 }, 			
			{ label: 'MERCHANT_ID_CA', name: 'merchantIdCa', index: 'merchant_id_ca', width: 80 }, 			
			{ label: 'MERCHANT_ID_COM', name: 'maerchantIdCom', index: 'maerchant_id_com', width: 80 }, 			
			{ label: 'MERCHANT_ID_COM_MX', name: 'maerchantIdComMx', index: 'maerchant_id_com_mx', width: 80 }, 			
			{ label: 'createTime', name: 'createTime', index: 'create_time', width: 80 }, 			
			{ label: 'updateTime', name: 'updateTime', index: 'update_time', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		mwsSeller: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.mwsSeller = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
			var url = vm.mwsSeller.id == null ? "../mwsseller/save" : "../mwsseller/update";
			$.ajax({
				type: "POST",
			    url: url,
			    data: JSON.stringify(vm.mwsSeller),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: "../mwsseller/delete",
				    data: JSON.stringify(ids),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get("../mwsseller/info/"+id, function(r){
                vm.mwsSeller = r.mwsSeller;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});