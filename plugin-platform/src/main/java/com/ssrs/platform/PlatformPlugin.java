package com.ssrs.platform;

import com.ssrs.framework.extend.plugin.AbstractPlugin;
import com.ssrs.framework.extend.plugin.PluginException;
import com.ssrs.platform.extend.CodeService;
import com.ssrs.platform.util.PlatformUtil;

public class PlatformPlugin extends AbstractPlugin {

    @Override
    public void start() throws PluginException {
        // 将各插件注册的Code持久化到数据库中
        CodeService.init();
        // 加载数据库中的配置项
        PlatformUtil.loadDBConfig();
    }

    @Override
    public void stop() throws PluginException {

    }
}