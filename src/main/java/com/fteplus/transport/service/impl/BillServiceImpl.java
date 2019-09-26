package com.fteplus.transport.service.impl;

import com.fteplus.transport.dto.BillExcution;
import com.fteplus.transport.entity.Bill;
import com.fteplus.transport.mapper.BillMapper;
import com.fteplus.transport.service.BillService;
import com.fteplus.transport.util.BillStateEnum;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class BillServiceImpl implements BillService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BillMapper billMapper;



//    插入bill表和detail_bill
    /**
     * @param bill
     * @return
     */
//    @Transactional
//    @Override
//    public BillInfoDto insertBill(Bill bill) {
//        BillInfoDto dto = new BillInfoDto();
//        try {
//            // 根据起始号和结束号 list集合插入detail_bill表
//            List <DetailBill> list = new ArrayList <>();
//            Integer beginNum = bill.getBeginNum();
//            Integer endNum = bill.getEndNum();
//            for (int i = beginNum; i <= endNum; i++) {
//                list.add(new DetailBill(bill.getType(), i));
//            }
//            Integer val1 = detailBillMapper.insertCollection(list);
//            if (val1 <= 0) {
//                throw new BillException("插入detail_bill表出错");
//            }
//            //  插入bill表
//            Integer val2 = billMapper.insert(bill);
//            logger.info(val2.toString() + "表计量");
//            if (val2 <= 0) {
//                throw new BillException("插入bill表出错");
//            } else {
//                dto.setMessage("插入成功");
//                dto.setFlag(true);
//                return dto;
//            }
//        } catch (BillException e1) {
//            throw e1;
//        } catch (Exception e) {
//            logger.info("bill模块的billInsert出问题");
//            throw new BillException(e.getMessage());
//        }
//    }


    @Override
    public BillExcution insertBill(Bill bill) {
        Integer result = -2;
        Map <String, Object> map = new HashMap <>();
        map.put("beginNum", bill.getBeginNum());
        map.put("endNum", bill.getEndNum());
        map.put("receiver", bill.getReceiver());
        map.put("receiverPhone", bill.getReceiverPhone());
        map.put("receivePlace", bill.getReceivePlace());
        map.put("distributePerson", bill.getDistributePerson());
        map.put("distributePersionPhone", bill.getDistributePersionPhone());
        map.put("receiveTime", bill.getReceiveTime());
        map.put("type", bill.getType());
        map.put("writeTime", bill.getWriteTime());
        map.put("status", "已填");
        map.put("result",result);
        try{
            billMapper.insertBillAndBillDetail(map);
            result = (Integer)map.get("result");
            if(result == 1){
                return new BillExcution(BillStateEnum.SUCCESS);
            }else{
                return new BillExcution(BillStateEnum.indexOf(result));
            }
        }catch(Exception e){
            return new BillExcution(BillStateEnum.INNER_ERROR);
        }
    }

    @Override
    public BillExcution selectByPage(Integer pageNo, Integer limit) {
        try{
            PageHelper.startPage(pageNo,limit);
            List<Bill> list = billMapper.selectAll();
            PageInfo pageInfo = new PageInfo(list);
            return new BillExcution(BillStateEnum.SUCCESS,pageInfo.getTotal(),list);
        }catch(Exception e){
           return new BillExcution(BillStateEnum.INNER_ERROR);
        }
    }


}
