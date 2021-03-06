package org.lpw.tephra.util;

import java.io.File;
import java.util.Map;

/**
 * HTTP连接器。用于提交HTTP访问。
 *
 * @author lpw
 */
public interface Http {
    /**
     * 通过GET方式获取远程页面数据。
     *
     * @param url        目标URL地址。
     * @param headers    HTTP头信息集。
     * @param parameters 参数集。
     * @return 如果成功则返回页面数据；否则返回null。
     */
    default String get(String url, Map<String, String> headers, Map<String, String> parameters) {
        return get(url, headers, parameters, null);
    }

    /**
     * 通过GET方式获取远程页面数据。
     *
     * @param url        目标URL地址。
     * @param headers    HTTP头信息集。
     * @param parameters 参数集。
     * @param charset    编码，为null则使用UTF-8。
     * @return 如果成功则返回页面数据；否则返回null。
     */
    String get(String url, Map<String, String> headers, Map<String, String> parameters, String charset);

    /**
     * 通过GET方式获取远程页面数据。
     *
     * @param url        目标URL地址。
     * @param headers    HTTP头信息集。
     * @param parameters 参数集。
     * @return 如果成功则返回页面数据；否则返回null。
     */
    default String get(String url, Map<String, String> headers, String parameters) {
        return get(url, headers, parameters, null);
    }

    /**
     * 通过GET方式获取远程页面数据。
     *
     * @param url        目标URL地址。
     * @param headers    HTTP头信息集。
     * @param parameters 参数集。
     * @param charset    编码，为null则使用UTF-8。
     * @return 如果成功则返回页面数据；否则返回null。
     */
    String get(String url, Map<String, String> headers, String parameters, String charset);

    /**
     * 通过POST方式获取远程页面数据。
     *
     * @param url        目标URL地址。
     * @param headers    HTTP头信息集。
     * @param parameters 参数集。
     * @return 如果成功则返回页面数据；否则返回null。
     */
    default String post(String url, Map<String, String> headers, Map<String, String> parameters) {
        return post(url, headers, parameters, null);
    }

    /**
     * 通过POST方式获取远程页面数据。
     *
     * @param url        目标URL地址。
     * @param headers    HTTP头信息集。
     * @param parameters 参数集。
     * @param charset    编码，为null则使用UTF-8。
     * @return 如果成功则返回页面数据；否则返回null。
     */
    String post(String url, Map<String, String> headers, Map<String, String> parameters, String charset);

    /**
     * 通过POST方式获取远程页面数据。
     *
     * @param url     目标URL地址。
     * @param headers HTTP头信息集。
     * @param content 参数内容。
     * @return 如果成功则返回页面数据；否则返回null。
     */
    default String post(String url, Map<String, String> headers, String content) {
        return post(url, headers, content, null);
    }

    /**
     * 通过POST方式获取远程页面数据。
     *
     * @param url     目标URL地址。
     * @param headers HTTP头信息集。
     * @param content 参数内容。
     * @param charset 编码，为null则使用UTF-8。
     * @return 如果成功则返回页面数据；否则返回null。
     */
    String post(String url, Map<String, String> headers, String content, String charset);

    /**
     * 上传文件。
     *
     * @param url        目标URL地址。
     * @param headers    HTTP头信息集。
     * @param parameters 参数集。
     * @param files      文件集。
     * @return 如果成功则返回页面数据；否则返回null。
     */
    default String upload(String url, Map<String, String> headers, Map<String, String> parameters, Map<String, File> files) {
        return upload(url, headers, parameters, files, null);
    }

    /**
     * 上传文件。
     *
     * @param url        目标URL地址。
     * @param headers    HTTP头信息集。
     * @param parameters 参数集。
     * @param files      文件集。
     * @param charset    编码，为null则使用UTF-8。
     * @return 如果成功则返回页面数据；否则返回null。
     */
    String upload(String url, Map<String, String> headers, Map<String, String> parameters, Map<String, File> files, String charset);

    /**
     * 下载文件。
     *
     * @param url        目标URL地址。
     * @param headers    HTTP头信息集。
     * @param parameters 参数集。
     * @param dest       下载文件保存路径。
     * @return HTTP请求返回头部信息集。
     */
    default Map<String, String> download(String url, Map<String, String> headers, Map<String, String> parameters, String dest) {
        return download(url, headers, parameters, null, dest);
    }

    /**
     * 下载文件。
     *
     * @param url        目标URL地址。
     * @param headers    HTTP头信息集。
     * @param parameters 参数集。
     * @param charset    编码，为null则使用UTF-8。
     * @param dest       下载文件保存路径。
     * @return HTTP请求返回头部信息集。
     */
    Map<String, String> download(String url, Map<String, String> headers, Map<String, String> parameters, String charset, String dest);

    /**
     * 下载文件。
     *
     * @param url        目标URL地址。
     * @param headers    HTTP头信息集。
     * @param parameters 参数集。
     * @param dest       下载文件保存路径。
     * @return HTTP请求返回头部信息集。
     */
    Map<String, String> download(String url, Map<String, String> headers, String parameters, String dest);

    /**
     * 获取最近一次请求返回状态码。
     *
     * @return 最近一次请求返回状态码；如果获取失败则返回0。
     */
    int getStatusCode();
}
