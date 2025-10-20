// Khi DOM được tải xong
document.addEventListener("DOMContentLoaded", function() {
  // Lấy form
  const form = document.querySelector("form");

  // Lắng nghe sự kiện submit
  form.addEventListener("submit", function(event) {
    event.preventDefault(); // Ngăn form gửi đi thật

    // Lấy giá trị từng input
    const fullname = document.getElementById("fullname").value;
    const email = document.getElementById("email").value;
    const message = document.getElementById("message").value;
    const gender = document.querySelector('input[name="gender"]:checked')?.value || "Chưa chọn";
    
    // Lấy danh sách sở thích (checkbox có thể chọn nhiều)
    const hobbies = Array.from(document.querySelectorAll('input[name="hobby"]:checked'))
                         .map(item => item.value)
                         .join(", ") || "Chưa chọn";

    // Lấy thành phố
    const city = document.getElementById("city").value;

    // Ghép thông tin hiển thị
    const info = `
      Họ tên: ${fullname}
      Email: ${email}
      Nội dung: ${message}
      Giới tính: ${gender}
      Sở thích: ${hobbies}
      Thành phố: ${city}
    `;

    // In ra console
    console.log(info);

    // Hiển thị lên trang (tùy chọn)
    const resultDiv = document.createElement("div");
    resultDiv.className = "result";
    resultDiv.innerText = info;
    document.body.appendChild(resultDiv);
  });
});