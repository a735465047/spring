package com.wowo.dao;


import com.wowo.model.ParamBean;
import com.wowo.model.ParamType;

import java.util.Date;
import java.util.List;

/**
 * Created by chenl.chen on 2016/3/30.
 */
public interface SpiderShareDao {
    List<ParamBean> selectQunarByTimeRange(final ParamType paramType, final Date beginTime,
            final Date endTime);

    int deleteQunarByTimeRange(final ParamType paramType, final Date endTime);


}
