package com.wowo.dao.impl;

import com.google.common.collect.Maps;
import com.wowo.dao.SpiderShareDao;
import com.wowo.model.ParamBean;
import com.wowo.model.ParamType;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by chenl.chen on 2016/3/30.
 */
@Repository
public class SpiderShareDaoImpl implements SpiderShareDao {

    @Resource
    private SqlSession sqlSessionTool;

    public List<ParamBean> selectQunarByTimeRange(final ParamType paramType, final Date beginTime,
            final Date endTime) {
        if (paramType == null || beginTime == null || endTime == null) {
            return Collections.emptyList();
        }

        final Map<String, Object> param = Maps.newHashMap();
        param.put("paramType", paramType.getId());
        param.put("beginTime", beginTime);
        param.put("endTime", endTime);

        return sqlSessionTool.selectList("spiderShare.selectQunarByTimeRange", param);
    }

    public int deleteQunarByTimeRange(final ParamType paramType, final Date endTime) {
        if (paramType == null || endTime == null) {
            return 0;
        }
        final Map<String, Object> param = Maps.newHashMap();
        param.put("paramType", paramType.getId());
        param.put("endTime", endTime);
        return sqlSessionTool.delete("spiderShare.deleteQunarByTimeRange", param);
    }

}
