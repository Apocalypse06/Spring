package ch05.ex03.model;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import ch05.ex00.model.Member;
import ch05.ex00.model.MemberDAO;
import ch05.ex00.model.MemberMapper;

public class MemberDAOSupport extends JdbcDaoSupport implements MemberDAO {
		public int save(Member member) {
			int count = 0 ;
			String SQL = "insert into SpringMember "
					+ " (pk, userId, password, name, email, birthday, registerDate, experience) "
					+ " values (null, ?, ?, ?, ?, ?, ?, ?)";
			System.out.println("save getJdbcTemplate()->" + getJdbcTemplate());
			getJdbcTemplate().update(SQL, member.getUserId(),
					member.getPassword(), member.getName(), 
					member.getEmail(), member.getBirthday(), 
					member.getRegDate(), member.getExperience());		
			count++;
			System.out.println("新建會員資料成功");
			return count;
		}
		// JdbcTemplate類別的queryForInt, queryForLong, queryForObject: ㄧ定要剛好傳回ㄧ列，如果傳回0列或多列都會丟出
		// IncorrectResultSizeDataAccessException。
		@Override
		public boolean idExists(String id) {
			String SQL = "select * from SpringMember where userId = ?";
			System.out.println("idExists getJdbcTemplate()->" + getJdbcTemplate());
			List<Member> list = getJdbcTemplate().query(SQL, new Object[] { id }, new MemberMapper());
			if ( list.isEmpty() ){
			  return false;
			}else {
			  return true;
			}
		}
		
		public Member get(int pk) {
			String SQL = "select * from SpringMember where pk = ?";
			System.out.println("get getJdbcTemplate()->" + getJdbcTemplate());
			Member student = getJdbcTemplate().queryForObject(SQL,
			new Object[] { pk }, new MemberMapper());
			return student;
		}

		public int delete(Integer pk) {
			int count = 0;
			String SQL = "delete from SpringMember where pk = ?";
			getJdbcTemplate().update(SQL, pk);
			count++;
			System.out.println("刪除記錄, 主鍵  = " + pk);
			return count;
		}

		public int update(Member member) {
			int count = 0;
			String SQL = "update SpringMember set  password = ?, "
					+ "name = ?, email = ?, birthday =?, registerDate =?, experience = ? where userId = ?";
			getJdbcTemplate().update(SQL, member.getPassword(), 
					member.getName(), member.getEmail(), 
					member.getBirthday(), member.getRegDate(), 
					member.getExperience(), member.getUserId()
			);
			count++;
			System.out.println("刪除記錄, account  = " + member.getUserId());
			return count;
		}

		@Override
		public List<Member> getAll() {
			String SQL = "select * from SpringMember";
			System.out.println("getJdbcTemplate()->" + getJdbcTemplate());
			
			List<Member> members = getJdbcTemplate()
					.query(SQL, new MemberMapper());
			return members;
		}

	}
/*	
	private DataSource dataSource = null;

	public MemberDAOSupport() {

	}
	public MemberDAOSupport(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public DataSource getDataSource(){
		return dataSource;
	}

	public boolean idExists(String id) {
		
		boolean exist = false;
		for (String s : memberIDList) {
			if (s.equals(id.trim())) {
				exist = true;
				break;
			}
		}
		return exist;
	}
	// 新增一筆Member紀錄
	public int saveMember(Member mem) {
		Connection conn = null;
		String sqlSqlserver = "Insert into memberExample values(?, ?, ?, ?, ?, ?)";
		String sqlMySQL     = "Insert into memberExample values(null, ?, ?, ?, ?, ?, ?)";
		String sql = sqlMySQL;
		int n = 0;
		try {
			//DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/MemberDataBase");
			DataSource ds = getDataSource();
			conn = ds.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, mem.getUserId());
			stmt.setString(2, mem.getPassword());
			stmt.setString(3, mem.getName());
			stmt.setString(4, mem.getEmail());
			stmt.setString(5, mem.getTel());
			stmt.setInt(6, mem.getExperience());
			n = stmt.executeUpdate();
			memberIDList.add(mem.getUserId());
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return n;
	}
	// 查詢一筆Member紀錄
	public Member getMember(int pk) {
		Member member = null;
		Connection conn = null;
		String sql = "Select * from memberExample where pk = ?";
		try {
			//DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/MemberDataBase");
			DataSource ds = getDataSource();
			conn = ds.getConnection();

			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, pk);
			ResultSet rset = stmt.executeQuery();
			if (rset.next()){
				member = new Member(
						    rset.getInt("pk"),
						    rset.getString("account"),
						    rset.getString("password"),
						    rset.getString("name"),
						    rset.getString("email"),
						    rset.getString("tel"),
						    rset.getInt("experience"));
			}			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return member;
	}
	// 更新一筆Member紀錄
	public int updateMember(Member mem) {
		int count = 0;
		Member member = null;
		Connection conn = null;
		String sql = "Update memberExample set account=?, password=?, name=?, email=?, tel=?, experience=? where pk = ?";
		try {
			//DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/MemberDataBase");
			DataSource ds = getDataSource();
			conn = ds.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, mem.getUserId());
			stmt.setString(2, mem.getPassword());
			stmt.setString(3, mem.getName());
			stmt.setString(4, mem.getEmail());
			stmt.setString(5, mem.getTel());
			stmt.setInt(6, mem.getExperience());
			stmt.setInt(7, mem.getPk());
			count = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return count;
	}
	// 刪除一筆Member紀錄
	public int deleteMember(String pk) {
		int count = 0;
		Member member = null;
		Connection conn = null;
		String sql = "Delete From memberExample where pk = ?";
		try {
			//DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/MemberDataBase");
			DataSource ds = getDataSource();
			conn = ds.getConnection();
			Integer ipk = Integer.valueOf(pk);
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, ipk);
			count = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return count;
	}
	// 查詢多筆Member紀錄
	public Collection<Member> getAllMembers() {
		Connection conn = null;
		Collection<Member> allMembers = new ArrayList<Member>();
		try {
			//DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/MemberDataBase");
			DataSource ds = getDataSource();
			conn = ds.getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT * from  memberExample");
			ResultSet rs = stmt.executeQuery();
			Member mem = null;
			while (rs.next()) {
				mem = new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs
						.getString(4), rs.getString(5), rs.getString(6), rs
						.getInt(7));
				allMembers.add(mem);
			}
			return allMembers;
		}  catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;	
	}
}
*/