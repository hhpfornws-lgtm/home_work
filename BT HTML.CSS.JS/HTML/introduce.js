// Đảm bảo code chỉ chạy sau khi toàn bộ HTML đã được tải xong
document.addEventListener('DOMContentLoaded', function() {

    // --- 1. Dữ liệu ---
    
    // Dữ liệu cho Sở thích
    const hobbiesData = [
        'Du lịch', 
        'Nhiếp ảnh', 
        'Ăn sầu riêng'
    ];

    // Dữ liệu cho Thông tin học tập
    const studyData = [
        { monHoc: 'Lập trình Java', diem: 9.0, xepLoai: 'Xuất sắc' },
        { monHoc: 'Cơ sở dữ liệu', diem: 8.5, xepLoai: 'Giỏi' },
        { monHoc: 'Tiếng Nhật IT', diem: 9.2, xepLoai: 'Xuất sắc' }
    ];

    // Dữ liệu cho Kỹ năng
    const skillsData = [
        'Java', 
        'SQL Server', 
        'HTML/CSS'
    ];

    // --- 2. Lấy các phần tử container trong HTML ---
    const hobbiesContainer = document.getElementById('hobbies-content');
    const studyContainer = document.getElementById('study-content');
    const skillsContainer = document.getElementById('skills-content');

    // --- 3. Tạo và chèn HTML cho Sở thích ---
    let hobbiesHtml = '<ul>';
    hobbiesData.forEach(hobby => {
        hobbiesHtml += `<li>${hobby}</li>`; // Dùng template literal (dấu `) cho dễ
    });
    hobbiesHtml += '</ul>';
    hobbiesContainer.innerHTML = hobbiesHtml;

    // --- 4. Tạo và chèn HTML cho Thông tin học tập ---
    let studyHtml = '<table border="1" class="table">';
    // Thêm hàng tiêu đề
    studyHtml += `
        <tr>
            <th>Môn học</th>
            <th>Điểm</th>
            <th>Xếp loại</th>
        </tr>
    `;
    // Thêm các hàng dữ liệu
    studyData.forEach(subject => {
        studyHtml += `
            <tr>
                <td>${subject.monHoc}</td>
                <td>${subject.diem}</td>
                <td>${subject.xepLoai}</td>
            </tr>
        `;
    });
    studyHtml += '</table>';
    studyContainer.innerHTML = studyHtml;

    // --- 5. Tạo và chèn HTML cho Kỹ năng ---
    let skillsHtml = '<ol>';
    skillsData.forEach(skill => {
        skillsHtml += `<li>${skill}</li>`;
    });
    skillsHtml += '</ol>';
    skillsContainer.innerHTML = skillsHtml;

});