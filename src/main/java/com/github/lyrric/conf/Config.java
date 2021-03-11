package com.github.lyrric.conf;

import com.github.lyrric.model.Member;

import java.util.List;

/**
 * Created on 2020-07-23.
 *
 * @author wangxiaodong
 */
public class Config {

    /**
     * 微信配置
     */
    public static String cookies = "UM_distinctid=1781f37c44b2de-09ccbbb33bf8ab-43066a60-384000-1781f37c44c194; _xzkj_=wxtoken:2e1a593522dcf8a592eda6454d6b97b3_fcd4c554d02fc00fe575137a98156a07; _xxhm_=%7B%22birthday%22%3A805910400000%2C%22birthdayStr%22%3A%221995-07-17%22%2C%22hasPassword%22%3Afalse%2C%22headerImg%22%3A%22http%3A%2F%2Fthirdwx.qlogo.cn%2Fmmopen%2FxjC97SLpMq3slgCMicgxfxCatEL5iaR9kHFtl2iaJRnXdrweZvBt2jUvV7et8cBKYHFlwkw4eNJkaaibQ0iaKp4s9C4GVd08qVbkG%2F132%22%2C%22mobile%22%3A%22150****1796%22%2C%22name%22%3A%22%E5%86%AF**%22%2C%22regionCode%22%3A%22440113%22%2C%22sex%22%3A2%2C%22uFrom%22%3A%22xgw%22%2C%22wxSubscribed%22%3A1%7D; _xxhmen_=D477896342D0B84DD4E2C72CAE177DCEA1BCEA3709723332C47475A7ECC23BDB02D7262F7578D16D914055C49A050A735C927AE559C15347511F32F04A5235A87B4E69425D67005FA84E2777340E41CFFA1933CEC9A49B1A9ADBB792B446B6F9F99DF67C4064C49EE043AAB96FC940906BCEFD0DD4414790889C1D2B9C4B295161542C618E51771E1D1781C4B0CE86564F341E2D99219B47C37F9EED9C0DC5B2029DCDC5C65D79E179044754CDD4F81E09C5D57138AA61A92C35C8213FD7382BCB8CFA70FCB701470E44803767DEDB4372D1766DD3E6914E29CFB220D5B1B4F429F95643D9085D32C0B10535BBB87DE6D4FC65FF0D327EF699168721788CC5D5182FBA0271163068AA404BF42348D782F4749B4D90AB73E7D0D7D7E61220D74DCEFFA9A393CC459F33A6496517AAF2F4435EF68BBE6E62B242B2D1D89E1052D4566306D3AD526CD566EE16375B6756FD4EBDAEF27FBDCF003B04CC5BB0275D4D075859762623DD04249E96B528C6A387FF2767AD411AB05593608122D8343B94546D1E265996AEE2477369212E4080162A90FABAF0D9CA4EA8DC9A8B1BFA2915AF250CAC0820C3677AAEFD3844FF0203; CNZZDATA1261985103=719965428-1615427259-%7C1615432665";
    public static String tk = "wxtoken:2e1a593522dcf8a592eda6454d6b97b3_fcd4c554d02fc00fe575137a98156a07";

    public static String reqHeader = "GET https://miaomiao.scmttec.com/seckill/seckill/list.do?offset=0&limit=10&regionCode=5101 HTTP/1.1\n" +
            "Host: miaomiao.scmttec.com\n" +
            "Connection: keep-alive\n" +
            "Accept: application/json, text/plain, */*\n" +
            "Cookie: _xxhm_=%7B%22heade" +
            "User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat\n" +
            "X-Requested-With: XMLHttpRequest\n" +
            "content-type: application/json\n" +
            "tk: wxapptoken:10:e0963da6b3e544f48fef5f6f27c32b5f\n" +
            "Referer: https://servicewechat.com/wxff8cad2e9bf18719/7/page-frame.html\n" +
            "Accept-Encoding: gzip, deflate, br\n" +
            "\n";

    /**
     * 接种成员ID
     */
    public static Integer memberId;
    /**
     * 接种成员身份证号码
     */
    public static String idCard;
    /**
     * 接种成员姓名
     */
    public static String memberName;
    /**
     * 选择的地区代码
     */
    public static String regionCode = "5101";

}
