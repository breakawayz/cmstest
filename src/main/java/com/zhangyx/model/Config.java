package com.zhangyx.model;

import com.github.autoconf.spring.reloadable.ReloadableProperty;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;


@Component
@Data
@Getter
public class Config {
    @ReloadableProperty("value")
    private int value;
}
