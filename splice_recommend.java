// ORM class for table 'splice.recommend'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Sep 18 17:38:00 UTC 2019
// For connector: org.apache.sqoop.manager.GenericJdbcManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class splice_recommend extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer ID;
  public Integer get_ID() {
    return ID;
  }
  public void set_ID(Integer ID) {
    this.ID = ID;
  }
  public splice_recommend with_ID(Integer ID) {
    this.ID = ID;
    return this;
  }
  private String UUID;
  public String get_UUID() {
    return UUID;
  }
  public void set_UUID(String UUID) {
    this.UUID = UUID;
  }
  public splice_recommend with_UUID(String UUID) {
    this.UUID = UUID;
    return this;
  }
  private String ITEM;
  public String get_ITEM() {
    return ITEM;
  }
  public void set_ITEM(String ITEM) {
    this.ITEM = ITEM;
  }
  public splice_recommend with_ITEM(String ITEM) {
    this.ITEM = ITEM;
    return this;
  }
  private java.math.BigDecimal SCORE;
  public java.math.BigDecimal get_SCORE() {
    return SCORE;
  }
  public void set_SCORE(java.math.BigDecimal SCORE) {
    this.SCORE = SCORE;
  }
  public splice_recommend with_SCORE(java.math.BigDecimal SCORE) {
    this.SCORE = SCORE;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof splice_recommend)) {
      return false;
    }
    splice_recommend that = (splice_recommend) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.UUID == null ? that.UUID == null : this.UUID.equals(that.UUID));
    equal = equal && (this.ITEM == null ? that.ITEM == null : this.ITEM.equals(that.ITEM));
    equal = equal && (this.SCORE == null ? that.SCORE == null : this.SCORE.equals(that.SCORE));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof splice_recommend)) {
      return false;
    }
    splice_recommend that = (splice_recommend) o;
    boolean equal = true;
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.UUID == null ? that.UUID == null : this.UUID.equals(that.UUID));
    equal = equal && (this.ITEM == null ? that.ITEM == null : this.ITEM.equals(that.ITEM));
    equal = equal && (this.SCORE == null ? that.SCORE == null : this.SCORE.equals(that.SCORE));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.UUID = JdbcWritableBridge.readString(2, __dbResults);
    this.ITEM = JdbcWritableBridge.readString(3, __dbResults);
    this.SCORE = JdbcWritableBridge.readBigDecimal(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.UUID = JdbcWritableBridge.readString(2, __dbResults);
    this.ITEM = JdbcWritableBridge.readString(3, __dbResults);
    this.SCORE = JdbcWritableBridge.readBigDecimal(4, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(ID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(UUID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ITEM, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SCORE, 4 + __off, 3, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(ID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(UUID, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ITEM, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(SCORE, 4 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ID = null;
    } else {
    this.ID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.UUID = null;
    } else {
    this.UUID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ITEM = null;
    } else {
    this.ITEM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.SCORE = null;
    } else {
    this.SCORE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ID);
    }
    if (null == this.UUID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UUID);
    }
    if (null == this.ITEM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ITEM);
    }
    if (null == this.SCORE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SCORE, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ID);
    }
    if (null == this.UUID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UUID);
    }
    if (null == this.ITEM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ITEM);
    }
    if (null == this.SCORE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.SCORE, __dataOut);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":"" + ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UUID==null?"null":UUID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ITEM==null?"null":ITEM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SCORE==null?"null":SCORE.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":"" + ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UUID==null?"null":UUID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ITEM==null?"null":ITEM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SCORE==null?"null":SCORE.toPlainString(), delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.UUID = null; } else {
      this.UUID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ITEM = null; } else {
      this.ITEM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SCORE = null; } else {
      this.SCORE = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.UUID = null; } else {
      this.UUID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ITEM = null; } else {
      this.ITEM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SCORE = null; } else {
      this.SCORE = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    splice_recommend o = (splice_recommend) super.clone();
    return o;
  }

  public void clone0(splice_recommend o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("UUID", this.UUID);
    __sqoop$field_map.put("ITEM", this.ITEM);
    __sqoop$field_map.put("SCORE", this.SCORE);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("UUID", this.UUID);
    __sqoop$field_map.put("ITEM", this.ITEM);
    __sqoop$field_map.put("SCORE", this.SCORE);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("ID".equals(__fieldName)) {
      this.ID = (Integer) __fieldVal;
    }
    else    if ("UUID".equals(__fieldName)) {
      this.UUID = (String) __fieldVal;
    }
    else    if ("ITEM".equals(__fieldName)) {
      this.ITEM = (String) __fieldVal;
    }
    else    if ("SCORE".equals(__fieldName)) {
      this.SCORE = (java.math.BigDecimal) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("ID".equals(__fieldName)) {
      this.ID = (Integer) __fieldVal;
      return true;
    }
    else    if ("UUID".equals(__fieldName)) {
      this.UUID = (String) __fieldVal;
      return true;
    }
    else    if ("ITEM".equals(__fieldName)) {
      this.ITEM = (String) __fieldVal;
      return true;
    }
    else    if ("SCORE".equals(__fieldName)) {
      this.SCORE = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
