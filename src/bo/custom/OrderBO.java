package bo.custom;

import bo.SuperBO;
import dto.CustomerDTO;
import dto.ItemDTO;
import dto.OrderDTO;
import entity.Customer;
import entity.Item;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderBO extends SuperBO {
    boolean purchaseOrder(OrderDTO dto) throws SQLException, ClassNotFoundException;

    String generateNewOrderId()throws SQLException, ClassNotFoundException;

    ArrayList<CustomerDTO> getAllCustomers()throws SQLException, ClassNotFoundException;

    ArrayList<ItemDTO> getAllItems()throws SQLException, ClassNotFoundException;

    ItemDTO searchItem(String code)throws SQLException, ClassNotFoundException;

    boolean ifItemExist(String code) throws SQLException, ClassNotFoundException;

    boolean ifCustomerExist(String id) throws SQLException, ClassNotFoundException;

    CustomerDTO searchCustomer(String s)throws SQLException, ClassNotFoundException;

    public Item getItem(String id) throws SQLException, ClassNotFoundException ;

    public Customer getCustomer(String id) throws SQLException, ClassNotFoundException ;
}
