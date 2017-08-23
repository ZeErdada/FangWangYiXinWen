package com.example.administrator.wangyixinwen.bean;

import java.util.List;

/**
 * Created by admin on 2017/8/8.
 */

public class NewsBean {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"5d2fe05827d3524acbb1f9742a2556e3","title":"新疆精河6.6级地震：老旧房屋出现垮塌、裂缝","date":"2017-08-09 09:20","category":"头条","author_name":"新疆地震局","url":"http://mini.eastday.com/mobile/170809092046183.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170809/20170809092046_dd13c974154ecbdd3d4e14605da56c65_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170809/20170809092046_dd13c974154ecbdd3d4e14605da56c65_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170809/20170809092046_dd13c974154ecbdd3d4e14605da56c65_3_mwpm_03200403.jpg"},{"uniquekey":"721830e8a7474b817b8211c2b203824f","title":"四川地震众星祈福 蒋欣转发地震逃生手册","date":"2017-08-09 09:21","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170809092130566.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170809/20170809092130_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170809/20170809092130_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"6a50f95e2fd20ad428ca7cec3176e15a","title":"十二星座八月的爱情运势如何? 看排行前三名的星座都有谁?","date":"2017-08-09 09:05","category":"头条","author_name":"星座细说","url":"http://mini.eastday.com/mobile/170809090511598.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170809/20170809_df3448b61d55d6f17f6ea057a557b65a_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170809/20170809_6e09759ae7b98d13f2b5e31cfbf982a7_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170809/20170809_0965d0f75ea984f2ee3c6af0abae64f4_cover_mwpm_03200403.jpeg"},{"uniquekey":"1a955a3c51ba79d2e208c7a9992299e2","title":"四川地震众星祈福 杨幂刘恺威吴京等祝愿平安","date":"2017-08-09 09:01","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170809090118411.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170809/20170809090118_d41d8cd98f00b204e9800998ecf8427e_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170809/20170809090118_d41d8cd98f00b204e9800998ecf8427e_10_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170809/20170809090118_d41d8cd98f00b204e9800998ecf8427e_9_mwpm_03200403.jpg"},{"uniquekey":"b2b3d3386fc77a4d84515d2a4f01bfc9","title":"九寨沟地震现场：车辆被滚落石块砸变形","date":"2017-08-09 09:00","category":"头条","author_name":"视觉中国","url":"http://mini.eastday.com/mobile/170809090033242.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170809/20170809090033_9e88e0a2a6ad72ce4560bc413a1e1f90_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170809/20170809090033_9e88e0a2a6ad72ce4560bc413a1e1f90_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170809/20170809090033_9e88e0a2a6ad72ce4560bc413a1e1f90_5_mwpm_03200403.jpg"},{"uniquekey":"436d17eb264687b3dcb0a6f167adf8e0","title":"距今1200年世界文化遗产惨遭韩语涂鸦","date":"2017-08-09 09:00","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809090033091.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170809/20170809090033_175d9b1fa489404a5b6d82843d8ed8bf_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170809/20170809090033_175d9b1fa489404a5b6d82843d8ed8bf_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170809/20170809090033_175d9b1fa489404a5b6d82843d8ed8bf_1_mwpm_03200403.jpg"},{"uniquekey":"126440e9631868394140dbe9a2363bd6","title":"河南广播电视台：辱警网民\u201c吕书国\u201d非我台员工，已报案","date":"2017-08-09 08:52","category":"头条","author_name":"微信公众号\u201c河南电视台新闻中心\u201d","url":"http://mini.eastday.com/mobile/170809085244034.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170809/20170809085244_1ad3e340dc7e2f78582959f5d989d25b_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170809/20170809085244_1ad3e340dc7e2f78582959f5d989d25b_2_mwpm_03200403.jpg"},{"uniquekey":"e3b9ae4f9ce0813db2a908e88e3f6a9a","title":"九寨沟地震救灾途中两车相撞 一名民兵不幸牺牲","date":"2017-08-09 08:50","category":"头条","author_name":"成都商报","url":"http://mini.eastday.com/mobile/170809085017686.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170809/20170809085017_57a1daa726d3cf739f100f734af3610a_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170809/20170809085017_57a1daa726d3cf739f100f734af3610a_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170809/20170809085017_57a1daa726d3cf739f100f734af3610a_1_mwpm_03200403.jpg"},{"uniquekey":"0b67842969f9b9d709142196502eb43d","title":"《林海雪原》热播 李光洁：我在\u201c林海\u201d打真虎","date":"2017-08-09 08:46","category":"头条","author_name":"法制晚报","url":"http://mini.eastday.com/mobile/170809084611471.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170809/20170809084611_1c14bba91bdfe5717cd185015c036697_1_mwpm_03200403.jpg"},{"uniquekey":"d7c2e8bf73a197ad50cc51a50d353e27","title":"韩国明年2月试行《安乐死法》 民众认识不足引发医疗界忧虑","date":"2017-08-09 08:40","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809084020158.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170809/20170809084020_f63a30f267a1218e26aa8d905cc75470_1_mwpm_03200403.jpg"},{"uniquekey":"e03262e55fbf85d787bc855421698c3c","title":"日本政府放宽外国厨师在日居留条件 厨艺好可永久居住","date":"2017-08-09 08:30","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809083011819.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170809/20170809083011_70dc54f1f23193c66fdef6edcf754f4c_1_mwpm_03200403.jpg"},{"uniquekey":"7a94013fcfff1f7f18192cbcbbf7a5a9","title":"乡下一斤才卖2块钱，它是了不起的抗癌蔬菜，你知道怎么吃么？","date":"2017-08-09 08:18","category":"头条","author_name":"智慧生活家","url":"http://mini.eastday.com/mobile/170809081837592.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170809/20170809_02db27285e71092752d8c811d9ab3598_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170809/20170809_25124d274c1639c187d49bc682385144_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170809/20170809_7586637dfc1e9936c7eb87ddde526ad4_cover_mwpm_03200403.jpeg"},{"uniquekey":"2f2ae7615382fff136e1bb1f83afebc2","title":"吕友清即将卸任驻坦桑尼亚大使","date":"2017-08-09 08:17","category":"头条","author_name":"驻坦桑尼亚使馆官网","url":"http://mini.eastday.com/mobile/170809081702581.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170809/20170809081702_ac01b7571442eadad1dce70f0953cc28_1_mwpm_03200403.jpg"},{"uniquekey":"b045d24953c5cf3d7fbad1187e4824ba","title":"中国女子入境美国遇暴力拘捕多处受伤 获赔309万","date":"2017-08-09 08:10","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/170809081040218.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170809/20170809081040_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"d981acfd5d8a0399e458e61429eda96b","title":"九寨沟7.0级地震震区发生769次地震 无4级以上余震","date":"2017-08-09 08:09","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170809080923904.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170809/20170809080923_47a02f77e440e1ab59e1a1db1a561116_1_mwpm_03200403.jpg"},{"uniquekey":"7a6dad06e7300a15c0ee4a13b9a07182","title":"20岁与50岁影坛大佬结婚，49岁丈夫去世，今约会富商买首饰","date":"2017-08-09 08:05","category":"头条","author_name":"八卦影评","url":"http://mini.eastday.com/mobile/170809080538591.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170809/20170809080538_107389cf860c6f74a3bbca0495b79a4f_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170809/20170809080538_107389cf860c6f74a3bbca0495b79a4f_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170809/20170809080538_107389cf860c6f74a3bbca0495b79a4f_1_mwpm_03200403.jpg"},{"uniquekey":"e3e33bd7593ef77bae00f3d8c01bcf3f","title":"新疆发生6.6级地震伴随数次余震 乌鲁木齐网友称有强烈震感","date":"2017-08-09 08:04","category":"头条","author_name":"新民网","url":"http://mini.eastday.com/mobile/170809080408113.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170809/20170809080408_38bd2c8b2f608f231ecab1c6e01a6da5_1_mwpm_03200403.jpg"},{"uniquekey":"e7a412a26c083454c7252af2f3d25400","title":"朱日和大阅兵刚结束，海军又举办一次重大军演，演习地点耐人寻味","date":"2017-08-09 08:03","category":"头条","author_name":"第一军情","url":"http://mini.eastday.com/mobile/170809080327436.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170809/20170809_4b0d350b5b5d182f65c8eaca6bd8e45c_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170809/20170809_81bf019bbb78ca7c43acff90dcbcc00b_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170809/20170809_483d259d1dca4dcb79ca6d0abff22a96_cover_mwpm_03200403.jpeg"},{"uniquekey":"dcca20716c47da49ecf7c3f56f0e057e","title":"这个东亚国家，可一夜造数千核弹，世界和平岌岌可危！","date":"2017-08-09 08:02","category":"头条","author_name":"第一军情","url":"http://mini.eastday.com/mobile/170809080253394.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170809/20170809_29d48ceb2bb0f772956a69de11fc9cad_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170809/20170809_db93f869028ee376fa2c611890f9d9ea_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170809/20170809_611c37c7d0fc34cfbb451d42e6da871c_cover_mwpm_03200403.jpeg"},{"uniquekey":"91cc9a575953f724d9af42dd8c4332bf","title":"印媒自吹可战胜解放军空军 我专家称一招可反制","date":"2017-08-09 07:59","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170809075922808.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170809/20170809075922_24eae9091d50b9e0b5a9e9107755a66f_1_mwpm_03200403.jpg"},{"uniquekey":"6a98e7675546560f095a7b0f71a21537","title":"她当导游10年二度遇地震 徒手掰开电梯门逃生","date":"2017-08-09 07:58","category":"头条","author_name":"华西都市报","url":"http://mini.eastday.com/mobile/170809075802267.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170809/20170809075802_d642bf2207eabae37e387478f21dd557_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170809/20170809075802_d642bf2207eabae37e387478f21dd557_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170809/20170809075802_d642bf2207eabae37e387478f21dd557_3_mwpm_03200403.jpg"},{"uniquekey":"4816c440f1cbaf2766198d75dd27c845","title":"俄呼吁中国境内俄罗斯人保持冷静 按政府指示行事","date":"2017-08-09 07:54","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809075434768.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170809/20170809075434_dc66525a8590a2e18d75359905513a4d_1_mwpm_03200403.jpg"},{"uniquekey":"b7aaf64fa7b256b176fa0071f52c90ba","title":"新疆精河县发生6.6级地震","date":"2017-08-09 07:51","category":"头条","author_name":"中国地震台网","url":"http://mini.eastday.com/mobile/170809075118951.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170809/20170809075118_15c1dffad15d266c29bbba0215ed3fd4_1_mwpm_03200403.png"},{"uniquekey":"f9b4b88202dff3a201b3da2f7df012a7","title":"韩外交部：2名韩国游客在四川地震中受伤","date":"2017-08-09 07:49","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809074902513.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170809/20170809074902_67c716f56ddcc3673d44b7310302d70b_1_mwpm_03200403.jpg"},{"uniquekey":"70c76db3bbbd1b9c881c722ec40a2e1e","title":"伊朗无人机逼近美国大黄蜂战机30米内 战机立即躲避","date":"2017-08-09 07:49","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809074902434.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170809/20170809074902_cbb3a730ca58839ec832b19b4ed73957_1_mwpm_03200403.jpg"},{"uniquekey":"41a42275e80d170ac854d44673210ae6","title":"菲佣，菲律宾\u201c国家英雄\u201d的背后","date":"2017-08-09 07:49","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170809074900327.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170809/20170809074900_92751dd3e7fb80c05ada1452a16b95fe_1_mwpm_03200403.jpg"},{"uniquekey":"0500d4bb876a6150775bc0a0cefb3de1","title":"俄媒：米哈伊尔·加卢津将成为新任俄驻日大使","date":"2017-08-09 07:49","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809074900170.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170809/20170809074900_fcadd62afa561a66cc11de2ffb1083b5_1_mwpm_03200403.jpg"},{"uniquekey":"63d74ffe945cfe2478c7614a21110a8c","title":"[独家]周冬雨放话考虑谈恋爱：最近阴气重","date":"2017-08-09 07:47","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170809074748619.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170809/20170809074748_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170809/20170809074748_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170809/20170809074748_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"90d06a9a6f0689bb8bd06e2ec8ceb44d","title":"新疆博尔塔拉州精河县附近发生6.1级左右地震","date":"2017-08-09 07:41","category":"头条","author_name":"中国地震台网","url":"http://mini.eastday.com/mobile/170809074157881.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170809/20170809074157_1312e4442b81b5a54449b09f2cf20a1d_1_mwpm_03200403.png"},{"uniquekey":"210d04324b98414db10aca5cb48b5ef8","title":"北京新房预售价红线放松 多高端盘预售价达9.5万元","date":"2017-08-09 07:32","category":"头条","author_name":"证券日报","url":"http://mini.eastday.com/mobile/170809073240455.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170809/20170809073240_e1fcea4c0a76cf0d0a6915a90b822c97_1_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    public String reason;
    public ResultEntity result;
    public int error_code;

    public static class ResultEntity {
        /**
         * stat : 1
         * data : [{"uniquekey":"5d2fe05827d3524acbb1f9742a2556e3","title":"新疆精河6.6级地震：老旧房屋出现垮塌、裂缝","date":"2017-08-09 09:20","category":"头条","author_name":"新疆地震局","url":"http://mini.eastday.com/mobile/170809092046183.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170809/20170809092046_dd13c974154ecbdd3d4e14605da56c65_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170809/20170809092046_dd13c974154ecbdd3d4e14605da56c65_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170809/20170809092046_dd13c974154ecbdd3d4e14605da56c65_3_mwpm_03200403.jpg"},{"uniquekey":"721830e8a7474b817b8211c2b203824f","title":"四川地震众星祈福 蒋欣转发地震逃生手册","date":"2017-08-09 09:21","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170809092130566.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170809/20170809092130_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170809/20170809092130_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"6a50f95e2fd20ad428ca7cec3176e15a","title":"十二星座八月的爱情运势如何? 看排行前三名的星座都有谁?","date":"2017-08-09 09:05","category":"头条","author_name":"星座细说","url":"http://mini.eastday.com/mobile/170809090511598.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170809/20170809_df3448b61d55d6f17f6ea057a557b65a_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170809/20170809_6e09759ae7b98d13f2b5e31cfbf982a7_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170809/20170809_0965d0f75ea984f2ee3c6af0abae64f4_cover_mwpm_03200403.jpeg"},{"uniquekey":"1a955a3c51ba79d2e208c7a9992299e2","title":"四川地震众星祈福 杨幂刘恺威吴京等祝愿平安","date":"2017-08-09 09:01","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170809090118411.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170809/20170809090118_d41d8cd98f00b204e9800998ecf8427e_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170809/20170809090118_d41d8cd98f00b204e9800998ecf8427e_10_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170809/20170809090118_d41d8cd98f00b204e9800998ecf8427e_9_mwpm_03200403.jpg"},{"uniquekey":"b2b3d3386fc77a4d84515d2a4f01bfc9","title":"九寨沟地震现场：车辆被滚落石块砸变形","date":"2017-08-09 09:00","category":"头条","author_name":"视觉中国","url":"http://mini.eastday.com/mobile/170809090033242.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170809/20170809090033_9e88e0a2a6ad72ce4560bc413a1e1f90_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170809/20170809090033_9e88e0a2a6ad72ce4560bc413a1e1f90_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170809/20170809090033_9e88e0a2a6ad72ce4560bc413a1e1f90_5_mwpm_03200403.jpg"},{"uniquekey":"436d17eb264687b3dcb0a6f167adf8e0","title":"距今1200年世界文化遗产惨遭韩语涂鸦","date":"2017-08-09 09:00","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809090033091.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170809/20170809090033_175d9b1fa489404a5b6d82843d8ed8bf_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170809/20170809090033_175d9b1fa489404a5b6d82843d8ed8bf_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170809/20170809090033_175d9b1fa489404a5b6d82843d8ed8bf_1_mwpm_03200403.jpg"},{"uniquekey":"126440e9631868394140dbe9a2363bd6","title":"河南广播电视台：辱警网民\u201c吕书国\u201d非我台员工，已报案","date":"2017-08-09 08:52","category":"头条","author_name":"微信公众号\u201c河南电视台新闻中心\u201d","url":"http://mini.eastday.com/mobile/170809085244034.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170809/20170809085244_1ad3e340dc7e2f78582959f5d989d25b_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170809/20170809085244_1ad3e340dc7e2f78582959f5d989d25b_2_mwpm_03200403.jpg"},{"uniquekey":"e3b9ae4f9ce0813db2a908e88e3f6a9a","title":"九寨沟地震救灾途中两车相撞 一名民兵不幸牺牲","date":"2017-08-09 08:50","category":"头条","author_name":"成都商报","url":"http://mini.eastday.com/mobile/170809085017686.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170809/20170809085017_57a1daa726d3cf739f100f734af3610a_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170809/20170809085017_57a1daa726d3cf739f100f734af3610a_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170809/20170809085017_57a1daa726d3cf739f100f734af3610a_1_mwpm_03200403.jpg"},{"uniquekey":"0b67842969f9b9d709142196502eb43d","title":"《林海雪原》热播 李光洁：我在\u201c林海\u201d打真虎","date":"2017-08-09 08:46","category":"头条","author_name":"法制晚报","url":"http://mini.eastday.com/mobile/170809084611471.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170809/20170809084611_1c14bba91bdfe5717cd185015c036697_1_mwpm_03200403.jpg"},{"uniquekey":"d7c2e8bf73a197ad50cc51a50d353e27","title":"韩国明年2月试行《安乐死法》 民众认识不足引发医疗界忧虑","date":"2017-08-09 08:40","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809084020158.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170809/20170809084020_f63a30f267a1218e26aa8d905cc75470_1_mwpm_03200403.jpg"},{"uniquekey":"e03262e55fbf85d787bc855421698c3c","title":"日本政府放宽外国厨师在日居留条件 厨艺好可永久居住","date":"2017-08-09 08:30","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809083011819.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170809/20170809083011_70dc54f1f23193c66fdef6edcf754f4c_1_mwpm_03200403.jpg"},{"uniquekey":"7a94013fcfff1f7f18192cbcbbf7a5a9","title":"乡下一斤才卖2块钱，它是了不起的抗癌蔬菜，你知道怎么吃么？","date":"2017-08-09 08:18","category":"头条","author_name":"智慧生活家","url":"http://mini.eastday.com/mobile/170809081837592.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170809/20170809_02db27285e71092752d8c811d9ab3598_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170809/20170809_25124d274c1639c187d49bc682385144_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170809/20170809_7586637dfc1e9936c7eb87ddde526ad4_cover_mwpm_03200403.jpeg"},{"uniquekey":"2f2ae7615382fff136e1bb1f83afebc2","title":"吕友清即将卸任驻坦桑尼亚大使","date":"2017-08-09 08:17","category":"头条","author_name":"驻坦桑尼亚使馆官网","url":"http://mini.eastday.com/mobile/170809081702581.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170809/20170809081702_ac01b7571442eadad1dce70f0953cc28_1_mwpm_03200403.jpg"},{"uniquekey":"b045d24953c5cf3d7fbad1187e4824ba","title":"中国女子入境美国遇暴力拘捕多处受伤 获赔309万","date":"2017-08-09 08:10","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/170809081040218.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170809/20170809081040_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"d981acfd5d8a0399e458e61429eda96b","title":"九寨沟7.0级地震震区发生769次地震 无4级以上余震","date":"2017-08-09 08:09","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170809080923904.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170809/20170809080923_47a02f77e440e1ab59e1a1db1a561116_1_mwpm_03200403.jpg"},{"uniquekey":"7a6dad06e7300a15c0ee4a13b9a07182","title":"20岁与50岁影坛大佬结婚，49岁丈夫去世，今约会富商买首饰","date":"2017-08-09 08:05","category":"头条","author_name":"八卦影评","url":"http://mini.eastday.com/mobile/170809080538591.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170809/20170809080538_107389cf860c6f74a3bbca0495b79a4f_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170809/20170809080538_107389cf860c6f74a3bbca0495b79a4f_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170809/20170809080538_107389cf860c6f74a3bbca0495b79a4f_1_mwpm_03200403.jpg"},{"uniquekey":"e3e33bd7593ef77bae00f3d8c01bcf3f","title":"新疆发生6.6级地震伴随数次余震 乌鲁木齐网友称有强烈震感","date":"2017-08-09 08:04","category":"头条","author_name":"新民网","url":"http://mini.eastday.com/mobile/170809080408113.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170809/20170809080408_38bd2c8b2f608f231ecab1c6e01a6da5_1_mwpm_03200403.jpg"},{"uniquekey":"e7a412a26c083454c7252af2f3d25400","title":"朱日和大阅兵刚结束，海军又举办一次重大军演，演习地点耐人寻味","date":"2017-08-09 08:03","category":"头条","author_name":"第一军情","url":"http://mini.eastday.com/mobile/170809080327436.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170809/20170809_4b0d350b5b5d182f65c8eaca6bd8e45c_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170809/20170809_81bf019bbb78ca7c43acff90dcbcc00b_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170809/20170809_483d259d1dca4dcb79ca6d0abff22a96_cover_mwpm_03200403.jpeg"},{"uniquekey":"dcca20716c47da49ecf7c3f56f0e057e","title":"这个东亚国家，可一夜造数千核弹，世界和平岌岌可危！","date":"2017-08-09 08:02","category":"头条","author_name":"第一军情","url":"http://mini.eastday.com/mobile/170809080253394.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170809/20170809_29d48ceb2bb0f772956a69de11fc9cad_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170809/20170809_db93f869028ee376fa2c611890f9d9ea_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170809/20170809_611c37c7d0fc34cfbb451d42e6da871c_cover_mwpm_03200403.jpeg"},{"uniquekey":"91cc9a575953f724d9af42dd8c4332bf","title":"印媒自吹可战胜解放军空军 我专家称一招可反制","date":"2017-08-09 07:59","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170809075922808.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170809/20170809075922_24eae9091d50b9e0b5a9e9107755a66f_1_mwpm_03200403.jpg"},{"uniquekey":"6a98e7675546560f095a7b0f71a21537","title":"她当导游10年二度遇地震 徒手掰开电梯门逃生","date":"2017-08-09 07:58","category":"头条","author_name":"华西都市报","url":"http://mini.eastday.com/mobile/170809075802267.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170809/20170809075802_d642bf2207eabae37e387478f21dd557_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170809/20170809075802_d642bf2207eabae37e387478f21dd557_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170809/20170809075802_d642bf2207eabae37e387478f21dd557_3_mwpm_03200403.jpg"},{"uniquekey":"4816c440f1cbaf2766198d75dd27c845","title":"俄呼吁中国境内俄罗斯人保持冷静 按政府指示行事","date":"2017-08-09 07:54","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809075434768.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170809/20170809075434_dc66525a8590a2e18d75359905513a4d_1_mwpm_03200403.jpg"},{"uniquekey":"b7aaf64fa7b256b176fa0071f52c90ba","title":"新疆精河县发生6.6级地震","date":"2017-08-09 07:51","category":"头条","author_name":"中国地震台网","url":"http://mini.eastday.com/mobile/170809075118951.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170809/20170809075118_15c1dffad15d266c29bbba0215ed3fd4_1_mwpm_03200403.png"},{"uniquekey":"f9b4b88202dff3a201b3da2f7df012a7","title":"韩外交部：2名韩国游客在四川地震中受伤","date":"2017-08-09 07:49","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809074902513.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170809/20170809074902_67c716f56ddcc3673d44b7310302d70b_1_mwpm_03200403.jpg"},{"uniquekey":"70c76db3bbbd1b9c881c722ec40a2e1e","title":"伊朗无人机逼近美国大黄蜂战机30米内 战机立即躲避","date":"2017-08-09 07:49","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809074902434.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170809/20170809074902_cbb3a730ca58839ec832b19b4ed73957_1_mwpm_03200403.jpg"},{"uniquekey":"41a42275e80d170ac854d44673210ae6","title":"菲佣，菲律宾\u201c国家英雄\u201d的背后","date":"2017-08-09 07:49","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170809074900327.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170809/20170809074900_92751dd3e7fb80c05ada1452a16b95fe_1_mwpm_03200403.jpg"},{"uniquekey":"0500d4bb876a6150775bc0a0cefb3de1","title":"俄媒：米哈伊尔·加卢津将成为新任俄驻日大使","date":"2017-08-09 07:49","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170809074900170.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170809/20170809074900_fcadd62afa561a66cc11de2ffb1083b5_1_mwpm_03200403.jpg"},{"uniquekey":"63d74ffe945cfe2478c7614a21110a8c","title":"[独家]周冬雨放话考虑谈恋爱：最近阴气重","date":"2017-08-09 07:47","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170809074748619.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170809/20170809074748_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170809/20170809074748_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170809/20170809074748_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"90d06a9a6f0689bb8bd06e2ec8ceb44d","title":"新疆博尔塔拉州精河县附近发生6.1级左右地震","date":"2017-08-09 07:41","category":"头条","author_name":"中国地震台网","url":"http://mini.eastday.com/mobile/170809074157881.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170809/20170809074157_1312e4442b81b5a54449b09f2cf20a1d_1_mwpm_03200403.png"},{"uniquekey":"210d04324b98414db10aca5cb48b5ef8","title":"北京新房预售价红线放松 多高端盘预售价达9.5万元","date":"2017-08-09 07:32","category":"头条","author_name":"证券日报","url":"http://mini.eastday.com/mobile/170809073240455.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170809/20170809073240_e1fcea4c0a76cf0d0a6915a90b822c97_1_mwpm_03200403.jpg"}]
         */

        public String stat;
        public List<DataEntity> data;

        public static class DataEntity {
            /**
             * uniquekey : 5d2fe05827d3524acbb1f9742a2556e3
             * title : 新疆精河6.6级地震：老旧房屋出现垮塌、裂缝
             * date : 2017-08-09 09:20
             * category : 头条
             * author_name : 新疆地震局
             * url : http://mini.eastday.com/mobile/170809092046183.html
             * thumbnail_pic_s : http://01.imgmini.eastday.com/mobile/20170809/20170809092046_dd13c974154ecbdd3d4e14605da56c65_4_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://01.imgmini.eastday.com/mobile/20170809/20170809092046_dd13c974154ecbdd3d4e14605da56c65_2_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://01.imgmini.eastday.com/mobile/20170809/20170809092046_dd13c974154ecbdd3d4e14605da56c65_3_mwpm_03200403.jpg
             */

            public String uniquekey;
            public String title;
            public String date;
            public String category;
            public String author_name;
            public String url;
            public String thumbnail_pic_s;
            public String thumbnail_pic_s02;
            public String thumbnail_pic_s03;
        }
    }
}