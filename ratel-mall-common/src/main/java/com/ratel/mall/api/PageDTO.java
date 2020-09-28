package com.ratel.mall.api;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

/**
 * @author ratel
 * @date 2020-09-28
 */
@Data
public class PageDTO<T> extends Page<T> {
    private T po;

    public PageDTO(long current, long size,T po) {
        super(current, size);
        this.po = po;
    }
}
